//Code done by Sasireha and reviewed by Jyotsna

package com.bosch.whm.model;
import java.util.HashSet;
import java.util.Set;

//developed by sneha, reviewed by Jyotsna
public class InventoryMasterBO {
	//new inbounds product 
	ProductInBoundBO productInBoundBO;
	Set<Product> Products=new HashSet<Product>();
	int inventoryCount=0;
	
	public InventoryMasterBO() {
		// TODO Auto-generated constructor stub
		Dimension dimension=new Dimension(5.0,6.0,7.0);
	    Product product1=new Product(1,"mouse",10,dimension,5.0);
	    Product product2=new Product(2,"monitor",20,dimension,4.0);
	    Product product3=new Product(3,"printer",30,dimension,2.0);
	   Products.add(product1);
	   Products.add(product2);
	   Products.add(product3);
	   
	   for(Product product:Products)
		{
			inventoryCount += product.getCurrentStock();
			System.out.println(product.getName() + product.getCurrentStock());
		}
	   System.out.println(inventoryCount);
	}
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
		int Count = 0;
		for(Product product:Products)
		{
			Count+=product.getCurrentStock();
		}
		return Count;
//		return 5;

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