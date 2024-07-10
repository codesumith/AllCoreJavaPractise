package com.sumith.library;
import java.sql.*;

public class DBConnection {
	
	public static Connection con;
	
	
	
	public DBConnection() {}
	
     static
     {
    	 try {
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dburl,DBInfo.uname,DBInfo.pword);
		} catch (Exception e) {e.printStackTrace();}
     }

     public static Connection getCon()
     {
		return con;
    	 
     }
}
