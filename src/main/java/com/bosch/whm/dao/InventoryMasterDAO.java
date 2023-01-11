/* Code developed by Sneha.S , Reviewed by Jyotsna
 *  Date: 30/12/2022 
 *  version 1.1
 */
package com.bosch.whm.dao;

import java.util.ArrayList;

import com.bosch.whm.model.Product;

public interface InventoryMasterDAO {

	public String addProduct(Product product);
	public int increaseInventoryCount();
	public int inventoryCountUpdate();
	public int inventoryCountDamage();
	public String validateData();
	public int decreaseInventoryCount();
	public ArrayList<Product> getProduct();
}
