package com.sumith.details;
import java.sql.*;

public class DBConnection {
	
	
	public static Connection con;
	
	static 
	{
		try {
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dburl,DBInfo.uname,DBInfo.pword);
		} 
		catch (Exception e) {e.printStackTrace();}
	}

	public Connection getCon()
	{
		return con;
		
	}
	
}
