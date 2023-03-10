package com.bosch.whm.service;

import com.bosch.whm.model.Inventory;
import com.bosch.whm.model.InventoryBO;

public class InventoryBOService {
	// implement all methods of Inventory
	InventoryBO inventoryBO;

	public InventoryBOService() {
		inventoryBO = new InventoryBO();
	}

	public void validateDataService(Inventory inventory) throws Exception// epic 4
	{
		if (inventory == null) {
			System.out.println("invalid inventorydata");

		} else {
			inventoryBO.validateData(inventory);
		}
	}

	public String validateDataServiceForTest(Inventory inventory) {

		if (inventory == null) {
			return "Invalid inventorydata";
		}

		else {
			return inventoryBO.validateDataForTest(inventory);
		}
	}
}
