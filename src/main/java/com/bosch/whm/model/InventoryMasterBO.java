package com.bosch.whm.model;
import java.util.HashSet;
import java.util.Set;
//developed by sneha, reviewed by Jyotsna
public class InventoryMasterBO {
	//new inbounds product 
	ProductInBoundBO productInBoundBO;
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
		inventoryCount=inventoryCount-1;
		return inventoryCount;		
	}		
}