//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.service;
import com.bosch.whm.model.InventoryMasterBO;
import com.bosch.whm.model.Product;

public class InventoryMasterBOService {
	//implement all methods of InventoryMasterBO
	InventoryMasterBO inventoryMasterBO;
	public String addProductService(Product product)//epic 5

	//have to use ProductInBoundBO and implement it

	{
		if(product!=null)
		{
			
			return inventoryMasterBO.addProduct(product);
		}
		else
		{
			return "null product";
		}
		
		
	}

	public int increaseInventoryCountService()//epic 5

	{	
		return inventoryMasterBO.increaseInventoryCount();		

	}

	public int inventoryCountUpdateService()//epic 5
	{
		return inventoryMasterBO.inventoryCountUpdate();		

	}

	public int inventoryCountDamageService()//epic 5
	{
		return inventoryMasterBO.inventoryCountDamage();
	
	}

	public String validateDataService()//epic 5

	{
		inventoryMasterBO.validateData();
		return null;

	}
	 public int decreaseInventoryCountService()//epic 5{	 

	    {
	        return inventoryMasterBO.decreaseInventoryCount();

	    }
	    public InventoryMasterBOService() {
	        // TODO Auto-generated constructor stub
	        inventoryMasterBO=new InventoryMasterBO();

	    }
	}