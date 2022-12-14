package com.bosch.whm.service;

import com.bosch.whm.model.Inventory;
import com.bosch.whm.model.InventoryBO;

public class InventoryBOService {
	// implement all methods of Inventory
	InventoryBO inventoryBO;
	 public InventoryBOService () {
		inventoryBO = new InventoryBO(); 
	 }
	public void validateDataService(Inventory inventory)// epic 4
	{
		if (inventory == null) {
			System.out.println("invalid inventorydata");
			
		}
		else
		{
			inventoryBO.validateData(inventory);
		}
	}
}
