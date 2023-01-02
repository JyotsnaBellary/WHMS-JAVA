/* Code developed by Sneha.S , Reviewed by Jyotsna
 *  Date: 30/12/2022 
 *  version 1.1
 */
package com.bosch.whm.dao;
import java.sql.*;
public class ConnectionUtil {
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}

}