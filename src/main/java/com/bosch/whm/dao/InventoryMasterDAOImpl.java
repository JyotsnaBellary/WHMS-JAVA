/* Code developed by Sneha.S, Reviewed by Jyotsna
 *  Date: 30/12/2022 
 *  version 1.1
 */
package com.bosch.whm.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bosch.whm.model.Product;

public class InventoryMasterDAOImpl implements InventoryMasterDAO {

	Connection connection= ConnectionUtil.getConnection();
	PreparedStatement pmt=null;
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			String Query="insert into products{?,?,?,?,?)";
			pmt=connection.prepareStatement(Query);
			pmt.setInt(1,product.getProductCode());
			pmt.setString(2,product.getName());
			pmt.setInt(3,product.getCurrentStock());
		    pmt.setDouble(4,product.getDimension());
			pmt.setDouble(5, product.getWeight());
			if(pmt.executeUpdate()>0)
			{
				return "product added";
			}
			else
			{
				return "product exist";
			}
		}
			
		catch(SQLException exe)
		{
			exe.printStackTrace();
		}
		finally
		{
			try
			{
				if(pmt!=null)
				{
					pmt.close();
				}
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch(SQLException exe)
			{
				exe.printStackTrace();
			}
		}
		
		return "product exist";
	}

	public int increaseInventoryCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int inventoryCountUpdate() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int inventoryCountDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String validateData() {
		// TODO Auto-generated method stub
		return null;
	}

	public int decreaseInventoryCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
