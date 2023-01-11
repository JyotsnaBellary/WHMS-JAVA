/* Code developed by Sneha.S, edited and Reviewed by Jyotsna
 *  Date: 30/12/2022 
 *  version 1.1
 *  version 1.1 updated to 1.2
 */
package com.bosch.whm.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.bosch.whm.model.Dimension;
import com.bosch.whm.model.Product;

public class InventoryMasterDAOImpl implements InventoryMasterDAO {

	Connection connection= ConnectionUtil.getConnection();
	Scanner scanner = new Scanner(System.in);
	PreparedStatement pmt=null;
	public InventoryMasterDAOImpl() {
		// TODO Auto-generated constructor stub
		Dimension dimension=new Dimension(5.0,6.0,7.0);
	    Product product1=new Product(50,"laptop",10,dimension,5.0);
	    Product product2=new Product(1,"monitor",20,dimension,4.0);
	    Product product3=new Product(13,"printer",30,dimension,2.0);
//	   addProduct(product3);
	    ArrayList<Product> productList = getProduct();
	    System.out.println("Product code      Product Name    Stock");
	    for(Product product: productList) {
       	 System.out.println(product.getProductCode()+" " + product.getName()+" " + product.getCurrentStock());
        }
	    
	}
	
	
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
		
			pmt=connection.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
			pmt.setInt(1,product.getProductCode());
			pmt.setString(2,product.getName());
			pmt.setInt(3,product.getCurrentStock());
		    pmt.setDouble(4,product.getDimension().getLength());
		    pmt.setDouble(5,product.getDimension().getWidth());
		    pmt.setDouble(6,product.getDimension().getHeight());
			pmt.setDouble(7, product.getWeight());
			int res = pmt.executeUpdate();
			if(res>0)
			{
				return "product added";
			}
			else
			{
				return "product exist";
			}
		}
		catch(SQLIntegrityConstraintViolationException e)
	    {
	    	return("Product exists");
	    }
		catch(SQLException exe)
		{
			exe.printStackTrace();
		}
		return "product exist";
	}

//Code developed by Sasireha, edited and reviewed by Jyotsna
	//increase current stock
	public int increaseInventoryCount() {
		// TODO Auto-generated method stub
		System.out.println("Enter product Id to update count: ");
		
//		for the purpose of unit testing
//		int pid = scanner.nextInt();
		int pid = 1;
		
		try
		{
			String Query="select * from product where PRODUCTCODE="+pid;
			pmt=connection.prepareStatement(Query);
			ResultSet resultSet = pmt.executeQuery();
			 //ArrayList<Product> productList = new ArrayList<Product>();

	         if(resultSet.next()) {
	        	 Dimension dimension = new Dimension(resultSet.getDouble(4),resultSet.getDouble(5),resultSet.getDouble(6));
	            Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), dimension,resultSet.getDouble(5));
	            product.setCurrentStock(product.getCurrentStock()+1);   	         
	         
			
		        String Query1="update product set currentStock=? where productcode=?";
				pmt=connection.prepareStatement(Query1);
				pmt.setInt(1,product.getCurrentStock());
				pmt.setInt(2,product.getProductCode());
				
				if(pmt.executeUpdate()>0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
	         }
		}
		catch(SQLException exe)
		{
			exe.printStackTrace();
		}	
		
		return 0;
	}

	//Code developed by Sasireha
	public int inventoryCountUpdate() {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("Enter 1.Increase  the count\n2.Decrease the count");
		choice = scanner.nextInt();
		int stock;
		
		switch(choice)
		{
		case 1:
			stock = increaseInventoryCount();
			break;
		case 2:
			stock = decreaseInventoryCount();
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		
		try {
			int currentStock = 0;
			String Query="select * from product";
			pmt=connection.prepareStatement(Query);
			ResultSet resultSet = pmt.executeQuery();
		 //ArrayList<Product> productList = new ArrayList<Product>();

         while(resultSet.next()) {

        	 Dimension dimension = new Dimension(resultSet.getDouble(4),resultSet.getDouble(5),resultSet.getDouble(6));
	            Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), dimension,resultSet.getDouble(5));
	           
           //  productList.add(product);
             
             currentStock += product.getCurrentStock();

         }
         return currentStock;
     } catch (SQLException e) {

         // TODO Auto-generated catch block

         e.printStackTrace();

     }
		return 0;
	}

	public int inventoryCountDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String validateData() {
		// TODO Auto-generated method stub
		return null;
	}

	//Code developed by Sasireha
	public int decreaseInventoryCount() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter product Id to update count: ");
		// for the purpose of unit testing. assuming product_ code as 1
		//int pid = scanner.nextInt();
		int pid = 1;
		
		try
		{
			String Query="select * from product where productcode="+pid;
			pmt=connection.prepareStatement(Query);
			ResultSet resultSet = pmt.executeQuery();

	         if(resultSet.next()) {
	        	 Dimension dimension = new Dimension(resultSet.getDouble(4),resultSet.getDouble(5),resultSet.getDouble(6));
		         Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), dimension,resultSet.getDouble(5));
		         product.setCurrentStock(product.getCurrentStock()-1);   	         
	         			
		        String Query1="update product set currentStock=? where productcode=? ";
				pmt=connection.prepareStatement(Query1);
				pmt.setInt(1,product.getCurrentStock());
				pmt.setInt(2,product.getProductCode());
			
				if(pmt.executeUpdate()>0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
	         }
		}
		catch(SQLException exe)
		{
			exe.printStackTrace();
		}
		
		return 0;
	}
	
	public ArrayList<Product> getProduct(){
		try
		{
			String Query="select * from product";
			pmt=connection.prepareStatement(Query);
			ResultSet resultSet = pmt.executeQuery();
			 ArrayList<Product> productList = new ArrayList<Product>();

	         while(resultSet.next()) {
	        	 Dimension dimension = new Dimension(resultSet.getDouble(4),resultSet.getDouble(5),resultSet.getDouble(6));
	            Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), dimension,resultSet.getDouble(5));
	            productList.add(product);
	         }
	         
	         return productList;
		}	
	    catch(SQLException exe)
		{
			return null;
		}
		
	}

}
