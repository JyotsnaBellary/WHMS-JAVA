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
=======
	//Code done by Sasireha and reviewed by Jyotsna
	
	package com.bosch.whm.model;
	
	import java.io.*;
	public class Inventory{
	  int ProductCode;
	  String ProductName;
	   String TransferType;
	   String CurrentLocation;
	   String ScannedLocation;
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
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
<<<<<<< HEAD
	//constructor created for Inventory.java
=======
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
	public Inventory(int productCode, String productName, String transferType, String currentLocation,
			String scannedLocation) {
		super();
		ProductCode = productCode;
		ProductName = productName;
		TransferType = transferType;
		CurrentLocation = currentLocation;
		ScannedLocation = scannedLocation;
	}
<<<<<<< HEAD
	
=======
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
}