//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.bosch.whm.dao.InventoryMasterDAOImpl;
import com.bosch.whm.model.Dimension;
import com.bosch.whm.model.Product;
import com.bosch.whm.service.InventoryMasterBOService;

public class InventoryMasterController {
		public static void main(String[] args) {
			//call required service classes
			try {
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
				System.out.println(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			InventoryMasterBOService inventoryMasterBOService = new InventoryMasterBOService();
			InventoryMasterDAOImpl inventoryMasterDAOImpl = new InventoryMasterDAOImpl();
			 Scanner scanner=new Scanner(System.in);
			 //Taking input from user
	            System.out.println("Enter the product code");
	            int productCode= scanner.nextInt();
	            System.out.println("Enter the product name");
	            String name= scanner.next();
	            System.out.println("Enter the current stock");
	            int currentStock = scanner.nextInt();
	            System.out.println("Enter the dimension");
	            System.out.println("Enter length");
	            double length = scanner.nextDouble();
	            System.out.println("Enter width");
	            double width = scanner.nextDouble();
	            System.out.println("Enter height");
	            double height = scanner.nextDouble();
	            System.out.println("Enter the product weight");
	            double weight = scanner.nextDouble();

//	            //creating dimension instance
	            Dimension dimension=new Dimension(length,width,height);
	            Product product=new Product(productCode,name,currentStock,dimension,weight);
//	            String addproduct=inventoryMasterBOService.addProductService(product);
	            String addproduct=inventoryMasterDAOImpl.addProduct(product);
	            
//	           if(addproduct.equals("product added"))
//	        		   {
//	        	   
//	        		   }
//	           else if(addproduct.equals("product exist"))
//	           {
//	        	   
//	           }
//	           else
//	           {
//	        	   System.out.println("add valid product");
//	           }
	           System.out.println(inventoryMasterDAOImpl.inventoryCountUpdate());
	           System.out.println(addproduct);
	        }
	 

	    }
