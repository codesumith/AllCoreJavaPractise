package com.sumith.connectingToDataBase;

import java.sql.*;


public class CreatingTable {
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
			
			try
			{
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Sumith@349");
				System.out.println("Connected to DataBase.....");
				Statement stmt=con.createStatement();
//				stmt.executeUpdate("create table Employee123(Eid Int(4),Ename char(15))");
//				System.out.println("Table Created Successfull... ");
				
				//Value Insertion;
				
//				stmt.executeUpdate("Insert into Employee123 values ('111','Rahul')");
//				System.out.println("Values Inserted... ");
				
				
				//Table Deletion
//				stmt.executeUpdate("drop table Employee123");
//				System.out.println("Table dropped...");
				
			}
	catch (Exception e)
			{
		e.printStackTrace();
			}
}
	}

