package com.sumith.metadetaOct18;

import java.sql.*;

import java.sql.DriverManager;

public class Metadata1 {

	public static void main(String[] args) {
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
		
		DatabaseMetaData md=con.getMetaData();
		
		System.out.println("Database product name :"+md.getDatabaseProductName());
		System.out.println("Database product Version :"+md.getDatabaseProductVersion());
		System.out.println("Database product Driver-name :"+md.getDriverName());
		System.out.println("Database maximum columns in table :"+md.getMaxColumnsInTable());

con.close();
		}
		
		catch(Exception e){e.printStackTrace();}
		
		

	}

}
