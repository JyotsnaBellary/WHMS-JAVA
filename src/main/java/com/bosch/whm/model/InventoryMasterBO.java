//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.model;
import java.util.HashSet;
import java.util.Set;
<<<<<<< HEAD
//developed by sneha, reviewed by Jyotsna
=======

>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
public class InventoryMasterBO {
	//new inbounds product 
	ProductInBoundBO productInBoundBO;
<<<<<<< HEAD
	Set<Product> Products=new HashSet<Product>();
	int inventoryCount=0;
	public String addProduct(Product product)//epic 5
	
	//have to use ProductInBoundBO and implement it
	{		
		if(Products.contains(product))
		{
			return "product exist";
		}
		else {
		Products.add(product);
		productInBoundBO=new ProductInBoundBO();
		productInBoundBO.createProduct(product);
		inventoryCount=inventoryCount+product.getCurrentStock();
		return "product added";		
		}
	}
	
	public int increaseInventoryCount()//epic 5
	{	
		inventoryCount=inventoryCount+1;
        return inventoryCount;
	}
	
	//returns the total inventory counts of all the products
	public int inventoryCountUpdate()//epic 5
	{
		for(Product product:Products)
		{
			inventoryCount+=product.getCurrentStock();
		}
		
		return inventoryCount;
=======
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

>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
	}
	public int inventoryCountDamage()//epic 5
	{
		return 0;
	}
	public String validateData()//epic 5
<<<<<<< HEAD
	{		
=======
	{
>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
		return null;
	}
	public int decreaseInventoryCount()//epic 5{
	{
<<<<<<< HEAD
		inventoryCount=inventoryCount-1;
		return inventoryCount;		
	}		
}
=======
		return 0;			
	}
}

>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
