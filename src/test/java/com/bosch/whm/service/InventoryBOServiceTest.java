package com.bosch.whm.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bosch.whm.model.Inventory;
 /*
  * InventoryBOServiceTest class
  * @author Keerthana
  * @since 22-12-2022
  */
public class InventoryBOServiceTest {

	 

    static InventoryBOService inventoryBOService;
    Inventory inventory,inventory2;
    

 

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        inventoryBOService = new InventoryBOService();

 

    }

 

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        inventoryBOService = null;
    }

 

    @Before
    public void setUp() throws Exception {
        inventory = new Inventory(1, "Sensor", "Standard", "BAN", "COB");
        inventory2 = null;
    }

 

    @After
    public void tearDown() throws Exception {
        inventory = null;
    }

 

    /*
     * Testcase to validate inventory data
     */

 

    @Test
    public void testValidateDataServiceForTest() {
    	String expected2 = "Invalid inventorydata";
    	String actual2 = inventoryBOService.validateDataServiceForTest(inventory2);
        assertEquals(expected2,actual2);    
        String expected = "Product available in inventory";
        String actual = inventoryBOService.validateDataServiceForTest(inventory);
        assertEquals(expected, actual);
    }

 

}
