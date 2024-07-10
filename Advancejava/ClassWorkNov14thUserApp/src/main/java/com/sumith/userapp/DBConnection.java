package com.sumith.userapp;

import java.sql.*;

public class DBConnection {

	Connection con;
	public Connection getCon()
	{
		try {
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dburl,DBInfo.user,DBInfo.password);
		} catch (Exception e) {e.printStackTrace();}
		
		return con;
		
	}
	
}
