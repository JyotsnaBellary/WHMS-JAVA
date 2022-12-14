//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.model;

import java.io.*;

public class Inventory{
  
  int ProductCode;
  	String ProductName;
   String TransferType;
   String CurrentLocation;
   String ScannedLocation;
<<<<<<< HEAD

=======
   
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
	public Inventory(int productCode, String productName, String transferType, String currentLocation,
			String scannedLocation) {
		super();
		ProductCode = productCode;
		ProductName = productName;
		TransferType = transferType;
		CurrentLocation = currentLocation;
		ScannedLocation = scannedLocation;
	}
>>>>>>> 7bea8a8d148512777ee71dd4d71c098b68487045

// create setters and getters
// create required constructors
}
