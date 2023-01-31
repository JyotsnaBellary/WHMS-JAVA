//created and developed by Jyotsna, 1/3/2023
package com.bosch.whm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bosch.whm.dao.InventoryMasterDAOImpl;
import com.bosch.whm.model.Dimension;
import com.bosch.whm.model.Product;

public class InventoryMasterDAOImplTest {

	//creating service instance
	 static InventoryMasterDAOImpl inventoryMasterDAOImpl;
	 static Product product;
	 static Dimension dimension;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inventoryMasterDAOImpl = new InventoryMasterDAOImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		inventoryMasterDAOImpl = null;
	}

	@Before
	public void setUp() throws Exception {
		Dimension dimension=new Dimension(5.0,6.0,7.0);
		Product product=new Product(1,"mouse",10,dimension,5.0);
	}

	@After
	public void tearDown() throws Exception {
		dimension = null;
		product = null;
	}

	@Test
	public void testAddProduct() {
		Dimension dimension=new Dimension(5.0,6.0,7.0);
		Product product=new Product(580,"waterbottle",10,dimension,5.0);
//	 	assertEquals("null product", inventoryMasterDAOImpl.addProduct(null));
	 	assertEquals("product added", inventoryMasterDAOImpl.addProduct(product));
	}

	@Test
	public void testIncreaseInventoryCount() {
		assertEquals(1, inventoryMasterDAOImpl.increaseInventoryCount());
	}

	

	@Test
	public void testDecreaseInventoryCount() {
		assertEquals(1, inventoryMasterDAOImpl.decreaseInventoryCount());
	}

}
