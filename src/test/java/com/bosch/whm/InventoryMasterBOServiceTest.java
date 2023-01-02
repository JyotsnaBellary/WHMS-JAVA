// 21/12/2022 , file created by Sneha.s,reviewed by Jyotsna
package com.bosch.whm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bosch.whm.service.InventoryMasterBOService;

public class InventoryMasterBOServiceTest {

	static InventoryMasterBOService inventoryMasterBOService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inventoryMasterBOService = new InventoryMasterBOService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		inventoryMasterBOService = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddProductService() {
		fail("Not yet implemented");
	}

	@Test
	public void testIncreaseInventoryCountService() {
		fail("Not yet implemented");
	}

	// code developed by sneha
	@Test
	public void testInventoryCountUpdateService() {
		//		fail("Not yet implemented");
		assertEquals(60, inventoryMasterBOService.inventoryCountUpdateService());
	}

	@Test
	public void testInventoryCountDamageService() {
		fail("Not yet implemented");
	}

	@Test
	public void testDecreaseInventoryCountService() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateDataService() {
		fail("Not yet implemented");
	}

}
