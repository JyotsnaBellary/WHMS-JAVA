/* Code developed by Sneha.S, Reviewed by Jyotsna
 *  Date: 30/12/2022 
 *  version 1.1
 */
package com.bosch.whm.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bosch.whm.model.Product;

public class InventoryMasterDAOImpl implements InventoryMasterDAO {

	Connection connection= ConnectionUtil.getConnection();
	Scanner scanner = new Scanner(System.in);
	PreparedStatement pmt=null;
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			String Query="insert into product{?,?,?,?,?)";
			pmt=connection.prepareStatement(Query);
			pmt.setInt(1,product.getProductCode());
			pmt.setString(2,product.getName());
			pmt.setInt(3,product.getCurrentStock());
		    pmt.setDouble(4,product.getDimension());
			pmt.setDouble(5, product.getWeight());
			if(pmt.executeUpdate()>0)
			{
				return "product added";
			}
			else
			{
				return "product exist";
			}
		}
			
		catch(SQLException exe)
		{
			exe.printStackTrace();
		}
		finally
		{
			try
			{
				if(pmt!=null)
				{
					pmt.close();
				}
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch(SQLException exe)
			{
				exe.printStackTrace();
			}
		}
		
		return "product exist";
	}

//Code developed by Sasireha
	public int increaseInventoryCount() {
		// TODO Auto-generated method stub
		System.out.println("Enter product Id to update count: ");
		int pid = scanner.nextInt();
		
		try
		{
			String Query="select * from product where id="+pid;
			pmt=connection.prepareStatement(Query);
			ResultSet resultSet = pmt.executeQuery();
			 //ArrayList<Product> productList = new ArrayList<Product>();

	         if(resultSet.next()) {

	            Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getDouble(4),resultSet.getDouble(5));
	            product.setCurrentStock(product.getCurrentStock()+1);   	         
	         
			
		        String Query1="update product set currentStock=? where pid=? ";
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
		finally
		{
			try
			{
				if(pmt!=null)
				{
					pmt.close();
				}
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch(SQLException exe)
			{
				exe.printStackTrace();
			}
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

             Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getDouble(4),resultSet.getDouble(5));

           //  productList.add(product);
             
             currentStock = product.getCurrentStock();

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
		int pid = scanner.nextInt();
		
		try
		{
			String Query="select * from product where id="+pid;
			pmt=connection.prepareStatement(Query);
			ResultSet resultSet = pmt.executeQuery();
			 //ArrayList<Product> productList = new ArrayList<Product>();

	         if(resultSet.next()) {

	            Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getDouble(4),resultSet.getDouble(5));
	            product.setCurrentStock(product.getCurrentStock()-1);   	         
	         			
		        String Query1="update product set currentStock=? where pid=? ";
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
		finally
		{
			try
			{
				if(pmt!=null)
				{
					pmt.close();
				}
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch(SQLException exe)
			{
				exe.printStackTrace();
			}
		}	
		
	
		return 0;
	}

}
