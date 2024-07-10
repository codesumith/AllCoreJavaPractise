package com.sumith.metadetaOct18;

import java.sql.*;

public class ResultMetaData {

	public static void main(String[] args) {
		

		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
		
		PreparedStatement ps =con.prepareStatement("Select * from emp_info");
		
		ResultSetMetaData rd=ps.getMetaData();
		
		int columnCount =rd.getColumnCount();
		System.out.println("Table Structure emp_info:");
		System.out.println("Number-Columns :"+columnCount);
		for(int i=1;i<=columnCount;i++)
		{
			System.out.println("Colmn "+i+" name :"+rd.getColumnName(i));
		}
		
		con.close();
//System.out.println("Column-Names :"+rd.);		
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
