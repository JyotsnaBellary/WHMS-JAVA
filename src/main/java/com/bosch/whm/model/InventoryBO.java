package com.bosch.whm.model;

import java.util.ArrayList;
import java.util.List;

public class InventoryBO {
	 List<Inventory> inventoryList = new ArrayList<Inventory>(); {
	        inventoryList.add(new Inventory(1, "Sensor", "Standard", "BAN", "COB"));
	        inventoryList.add(new Inventory(2, "Steering", "Direcct", "HYD", "COB"));
	        inventoryList.add(new Inventory(3, "Radar", "Inspection", "BAN", "HYD"));
	        inventoryList.add(new Inventory(4, "Tool", "Direct", "COB", "HYD"));
	        inventoryList.add(new Inventory(5, "DishWasher", "Standard", "HYD", "COB"));
	    }


	    public void validateData(Inventory inventory )//epic 4
	    {   
	        int count = 0;
	        //call the inventory validate data method
	        for(Inventory item:inventoryList) {
	            if(item.equals(inventory)) {
	                count++;
	            }
	        }
	        if(count >= 1) {
	            System.out.println("Product available in inventory");
	        }
	        else {
	            System.out.println("Product not available in inventory");
	        }
	    }
	public String updateInventryCount()//epic 5

	{
		return null;
		//update your inventrycount

	}




}

