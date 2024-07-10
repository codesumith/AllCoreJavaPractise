package com.sumith.connectingToDataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try
		{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Sumith@349");
			System.out.println("Connected to DataBase.....");
		}
catch (Exception e)
		{
	e.printStackTrace();
		}
	}

}
