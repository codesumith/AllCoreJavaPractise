package com.sumith.metadata;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class DBCon14 {

	public static void main(String[] args) {
		
		try
		{
			FileReader fr=new FileReader("/Users/sumith/Desktop/JavaIoFiles/connection.properties");
			Properties p=new Properties();
			p.load(fr);
			
			Connection con =DriverManager.getConnection(p.getProperty("Driver"),p.getProperty("User"),p.getProperty("Password"));
			
			System.out.println("****DataBaseMetaData****");
			DatabaseMetaData dmd=con.getMetaData();
			System.out.println("Driver-name:"+dmd.getDriverName());
			System.out.println("Version :"+dmd.getDatabaseMajorVersion());
			
			PreparedStatement ps=con.prepareStatement("Select Customer_name,Mail_id from Customer56 where cid =?");
			ps.setString(1, "A111");
			ResultSet rs =ps.executeQuery();
			System.out.println("----CustomerData----");
			if(rs.next())
			{
				System.out.println(rs.getString(1)+
						"\t"+rs.getString(2));
			}
			
			System.out.println("****ParameterMetaData****");
			ParameterMetaData pmd =ps.getParameterMetaData();
			System.out.println("para-count:"+pmd.getParameterCount());
			
			System.out.println("****ResultSetMetaData****");
			ResultSetMetaData rsmd =rs.getMetaData();
			System.out.println("Col-Count:"+rsmd.getColumnCount());
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
