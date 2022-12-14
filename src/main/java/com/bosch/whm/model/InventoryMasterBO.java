//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.model;
import java.util.HashSet;
import java.util.Set;

public class InventoryMasterBO {


	//new inbound product 
	ProductInBoundBO productInBoundBO;
	Set<Product> products=new HashSet<Product>();
    int inventoryCount=0;
    public String addProduct(Product product)//epic 5 

    //have to use ProductInBoundBO and implement it

    {	

        if(!products.add(product))
        {
            return "product exist";
        }
        else {
        
        
        return "product added";        
        }

    }
    

	public int increaseInventoryCount()//epic 5

	{	
		inventoryCount=inventoryCount+1;
        return inventoryCount;

	}

	public int inventoryCountUpdate()//epic 5
	{
		return inventoryCount;

	}


	public int inventoryCountDamage()//epic 5
	{
		return 0;

	}

	public String validateData()//epic 5

	{
		return null;

	}
	public int decreaseInventoryCount()//epic 5{

	{
		return 0;			

	}
}

