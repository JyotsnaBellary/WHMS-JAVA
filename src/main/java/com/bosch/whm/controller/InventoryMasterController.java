<<<<<<< HEAD
package com.bosch.whm.model;

import java.io.*;

public class Inventory{

	int ProductCode;
	String ProductName;
	String TransferType;
	String CurrentLocation;
	String ScannedLocation;

	// create setters and getters
	// create required constructors
	public int getProductCode() {
		return ProductCode;
	}
	public void setProductCode(int productCode) {
		ProductCode = productCode;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getTransferType() {
		return TransferType;
	}
	public void setTransferType(String transferType) {
		TransferType = transferType;
	}
	public String getCurrentLocation() {
		return CurrentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		CurrentLocation = currentLocation;
	}
	public String getScannedLocation() {
		return ScannedLocation;
	}
	public void setScannedLocation(String scannedLocation) {
		ScannedLocation = scannedLocation;
	}
	//constructor created for Inventory.java
	public Inventory(int productCode, String productName, String transferType, String currentLocation,
			String scannedLocation) {
		super();
		ProductCode = productCode;
		ProductName = productName;
		TransferType = transferType;
		CurrentLocation = currentLocation;
		ScannedLocation = scannedLocation;
	}
	
}
=======
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


>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
