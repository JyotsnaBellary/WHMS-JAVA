//Code done by Sasireha and reviewed by Jyotsna
//developed by sneha, reviewed by Jyotsna
package com.bosch.whm.service;
import com.bosch.whm.dao.InventoryMasterDAOImpl;
import com.bosch.whm.model.InventoryMasterBO;
import com.bosch.whm.model.Product;

public class InventoryMasterBOService {
	//implement all methods of InventoryMasterBO
	static InventoryMasterBO inventoryMasterBO;

	InventoryMasterDAOImpl inventoryMasterDAOImpl;
	//have to use ProductInBoundBO and implement it
	public InventoryMasterBOService() {
		// TODO Auto-generated constructor stub
		inventoryMasterBO = new InventoryMasterBO();
		inventoryMasterDAOImpl = new InventoryMasterDAOImpl();
	}
	public String addProductService(Product product)//epic 5
	{
		if(product!=null)
		{
//			return inventoryMasterBO.addProduct(product);
			//On JDBC Connection 
			return inventoryMasterDAOImpl.addProduct(product);
			
		}

		else
		{
			return "null product";
		}

	}
	public int increaseInventoryCountService()//epic 5
	{	
		return inventoryMasterBO.increaseInventoryCount();	
//		return inventoryMasterDAOImpl.increaseInventoryCount();

	}

	public int inventoryCountUpdateService()//epic 5
	{
//		return inventoryMasterBO.inventoryCountUpdate();
		return inventoryMasterDAOImpl.inventoryCountUpdate();

	}
	public int inventoryCountDamageService()//epic 5
	{
		return inventoryMasterBO.inventoryCountDamage();

	}


	public int decreaseInventoryCountService()//epic 5{	 

	{
		return inventoryMasterBO.decreaseInventoryCount();

	}
	public String validateDataService()//epic 5

	{
		inventoryMasterBO.validateData();
		return null;

	}
	
}
