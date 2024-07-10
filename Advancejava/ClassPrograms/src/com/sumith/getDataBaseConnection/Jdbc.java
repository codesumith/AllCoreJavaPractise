package com.sumith.getDataBaseConnection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Jdbc {
	
	public static Connection getConnection()
	{
		
		Connection con = null ;
		try 
		{
			
		FileInputStream fis =new FileInputStream("/Users/sumith/eclipse-workspace/Advancejava/ClassPrograms/src/jdbc.properties");
		Properties p =new Properties();
		p.load(fis);
		con = DriverManager.getConnection(p.getProperty("jdbc.Url"),p.getProperty("jdbc.UserName"),p.getProperty("jdbc.Password"));
		
		}
		
		catch (Exception e) 
		{
			
			e.printStackTrace();
		
		
	    }
		
		return con;
	}

}
