// 21/12/2022 , file created by Sneha.s,reviewed by Jyotsna
package com.bosch.whm;
import java.lang.Object;
import static org.junit.Assert.*; 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bosch.whm.model.Dimension;
import com.bosch.whm.model.Product;
import com.bosch.whm.service.InventoryMasterBOService; 

public class InventoryMasterBOServiceTest { 

    //creating service instance
    static InventoryMasterBOService inventoryMasterBOService;
    static Product product;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        inventoryMasterBOService = new InventoryMasterBOService();
        product = new Product();
    } 

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        inventoryMasterBOService = null;
    } 

    @Before
    public void setUp() throws Exception {
        Dimension dimension=new Dimension(5.0,6.0,7.0);
		Product product=new Product(1,"mouse",10,dimension,5.0);
    }

    // Developed by Sasireha
    @After
    public void tearDown() throws Exception {
    	product = null;
    } 
    
    // Developed by Sasireha
    //Testcase to check if product is successfully added.
    @Test
    public void testAddProductService() {
    	assertEquals("null product", inventoryMasterBOService.addProductService(null));
    	assertEquals("product added", inventoryMasterBOService.addProductService(product));
    } 
    
    // Developed by Sasireha
    //returns total count of Inventory count after increasing
    @Test
    public void testIncreaseInventoryCountService() {
        assertEquals(60, inventoryMasterBOService.increaseInventoryCountService());
    } 

    // code developed by sneha
    //returns total count of inventory
    @Test
    public void testInventoryCountUpdateService() {
        assertEquals(60, inventoryMasterBOService.inventoryCountUpdateService());
    } 

    // Developed by Sasireha
    @Test
    public void testInventoryCountDamageService() {
        assertEquals(0, inventoryMasterBOService.inventoryCountDamageService());
    } 

    // Developed by Sasireha
    //returns total count of inventory after decreasing
    @Test
    public void testDecreaseInventoryCountService() {
        assertEquals(59, inventoryMasterBOService.decreaseInventoryCountService());
    } 

    @Test
    public void testValidateDataService() {
        fail("Not yet implemented");
    } 

}
