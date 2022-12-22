
package com.bosch.whm.model;

import java.io.*;

public class Inventory{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CurrentLocation == null) ? 0 : CurrentLocation.hashCode());
		result = prime * result + ProductCode;
		result = prime * result + ((ProductName == null) ? 0 : ProductName.hashCode());
		result = prime * result + ((ScannedLocation == null) ? 0 : ScannedLocation.hashCode());
		result = prime * result + ((TransferType == null) ? 0 : TransferType.hashCode());
		return result;
	}

	@Override
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
	private int ProductCode;
	private String ProductName;
	private String TransferType;
	private String CurrentLocation;
	private String ScannedLocation;
	
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

	// create setters and getters
	// create required constructors

	//Code done by Sasireha and reviewed by Jyotsna

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
}
