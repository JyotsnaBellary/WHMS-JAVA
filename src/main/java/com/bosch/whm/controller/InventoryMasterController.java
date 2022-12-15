//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.controller;
import java.util.Scanner;
import com.bosch.whm.model.Dimension;
import com.bosch.whm.model.Product;
import com.bosch.whm.service.InventoryMasterBOService;

public class InventoryMasterController {
		public static void main(String[] args) {
			//call required service classes
			InventoryMasterBOService inventoryMasterBOService = new InventoryMasterBOService();
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

	            //creating dimension instance
	            Dimension dimension=new Dimension(length,width,height);
	            Product product=new Product(productCode,name,currentStock,dimension,weight);;
	            String addproduct=inventoryMasterBOService.addProductService(product);
	           if(addproduct.equals("product added"))
	        		   {
	        	   
	        		   }
	           else if(addproduct.equals("product exist"))
	           {
	        	   
	           }
	           else
	           {
	        	   System.out.println("add valid product");
	           }

	        }
	 

	    }