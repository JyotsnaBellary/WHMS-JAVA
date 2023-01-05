package com.bosch.whm.controller;
import java.util.Scanner;
import com.bosch.whm.model.Inventory;
import com.bosch.whm.service.InventoryBOService;
public class InventoryController {

	public static void main(String[] args) {
		// call required service classes
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the product code");
		int productCode = scanner.nextInt();
		System.out.println("Enter the product name");
		String productName = scanner.next();
		System.out.println("Enter the transfer type");
		String transferType = scanner.next();
		System.out.println("Enter the current location");
		String currentLocation = scanner.next();
		System.out.println("Enter the scanned location");
		String scannedLocation = scanner.next();
		Inventory item = new Inventory(productCode, productName, transferType, currentLocation, scannedLocation);

		InventoryBOService inventoryBOService = new InventoryBOService();
//		inventoryBOService.validateDataService(item);
	}

}
