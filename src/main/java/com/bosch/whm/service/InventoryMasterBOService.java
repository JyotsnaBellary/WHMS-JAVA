<<<<<<< HEAD
<<<<<<< HEAD
=======
//Code done by Sasireha and reviewed by Jyotsna
=======
//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.service;
import com.bosch.whm.model.InventoryMasterBO;
import com.bosch.whm.model.Product;
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3

package com.bosch.whm.service;
import com.bosch.whm.model.InventoryMasterBO;
import com.bosch.whm.model.Product;
>>>>>>> 7bea8a8d148512777ee71dd4d71c098b68487045

package com.bosch.whm.service;
import com.bosch.whm.model.InventoryMasterBO;
import com.bosch.whm.model.Product;

//developed by sneha, reviewed by Jyotsna
public class InventoryMasterBOService {
	//implement all methods of InventoryMasterBO
	InventoryMasterBO inventoryMasterBO;
	public String addProductService(Product product)//epic 5
<<<<<<< HEAD
<<<<<<< HEAD
	
	//have to use ProductInBoundBO and implement it
=======

	//have to use ProductInBoundBO and implement it

>>>>>>> 7bea8a8d148512777ee71dd4d71c098b68487045
	{
		if(product!=null)
		{
			inventoryMasterBO.addProduct(product);
			return "product added";
		}
<<<<<<< HEAD

=======
>>>>>>> 7bea8a8d148512777ee71dd4d71c098b68487045
=======

	//have to use ProductInBoundBO and implement it

	{
		if(product!=null)
		{
			
			return inventoryMasterBO.addProduct(product);
		}
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
		else
		{
			return "null product";
		}
<<<<<<< HEAD
<<<<<<< HEAD

	}
	public int increaseInventoryCountService()//epic 5
	{	
		return inventoryMasterBO.increaseInventoryCount();
		
=======
=======
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
		
		
	}

	public int increaseInventoryCountService()//epic 5

	{	
		return inventoryMasterBO.increaseInventoryCount();		

<<<<<<< HEAD
>>>>>>> 7bea8a8d148512777ee71dd4d71c098b68487045
=======
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
	}

	public int inventoryCountUpdateService()//epic 5
	{
<<<<<<< HEAD
<<<<<<< HEAD

		return inventoryMasterBO.inventoryCountUpdate();
		
	}
	public int inventoryCountDamageService()//epic 5
	{
		return inventoryMasterBO.inventoryCountDamage();
		

	}
	public String validateDataService()//epic 5
	{
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


	
	
=======
=======
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
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
<<<<<<< HEAD
	}
>>>>>>> 7bea8a8d148512777ee71dd4d71c098b68487045
=======
	}
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
