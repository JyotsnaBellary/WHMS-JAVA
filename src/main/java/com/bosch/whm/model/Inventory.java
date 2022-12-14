//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.model;

public class Inventory{
  int ProductCode;
  String ProductName;
  String TransferType;
  String CurrentLocation;
  String ScannedLocation;
  
 public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inventory other = (Inventory) obj;
		if (CurrentLocation == null) {
			if (other.CurrentLocation != null)
				return false;
		} else if (!CurrentLocation.equals(other.CurrentLocation))
			return false;
		if (ProductCode != other.ProductCode)
			return false;
		if (ProductName == null) {
			if (other.ProductName != null)
				return false;
		} else if (!ProductName.equals(other.ProductName))
			return false;
		if (ScannedLocation == null) {
			if (other.ScannedLocation != null)
				return false;
		} else if (!ScannedLocation.equals(other.ScannedLocation))
			return false;
		if (TransferType == null) {
			if (other.TransferType != null)
				return false;
		} else if (!TransferType.equals(other.TransferType))
			return false;
		return true;
	}
   
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


// create setters and getters
// create required constructors
}
