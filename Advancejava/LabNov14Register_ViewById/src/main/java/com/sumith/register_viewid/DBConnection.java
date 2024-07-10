package com.sumith.register_viewid;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	
	Connection con;
	public Connection getcon()
	{
		try {
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dburl,DBInfo.user,DBInfo.password);
		} catch (Exception e) {e.printStackTrace();}
		return con;
	}

}
