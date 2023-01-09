package com.bosch.whm.model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventoryBO {
	/*
	 * keerthana validate the inventory data
	 */
	List<Inventory> inventoryList = new ArrayList<Inventory>();
	{
		inventoryList.add(new Inventory(1, "Sensor", "Standard", "BAN", "COB"));
		inventoryList.add(new Inventory(2, "Steering", "Direcct", "HYD", "COB"));
		inventoryList.add(new Inventory(3, "Radar", "Inspection", "BAN", "HYD"));
		inventoryList.add(new Inventory(4, "Tool", "Direct", "COB", "HYD"));
		inventoryList.add(new Inventory(5, "DishWasher", "Standard", "HYD", "COB"));
	}

	/*
	 * This method is to validate the inventory data
	 */

	public void validateData(Inventory inventory) throws Exception// epic 4
	{
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "pswd");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from inventory");
		int count = 0;
		while (resultSet.next()) {
			int productCode = resultSet.getInt(0);
			String productName = resultSet.getString(1);
			String transferType = resultSet.getString(2);
			String currentLocation = resultSet.getString(3);
			String scannedLocation = resultSet.getString(4);

			if ((new Inventory(productCode, productName, transferType, currentLocation, scannedLocation))
					.equals(inventory)) {
				count++;
				break;
			}

		}
		if (count > 0) {
			System.out.println("Product available in inventory");
		} else {
			System.out.println("Product not available in inventory");
		}
	}

	public String validateDataForTest(Inventory inventory) {
		int count = 0;
		// call the inventory validate data method
		for (Inventory item : inventoryList) {
			if (item.equals(inventory)) {
				count++;
			}
		}
		if (count >= 1) {
			return ("Product available in inventory");
		} else {
			return ("Product not available in inventory");
		}
	}

	public String updateInventryCount()// epic 5

	{
		return null;
		// update your inventory count

	}

}
