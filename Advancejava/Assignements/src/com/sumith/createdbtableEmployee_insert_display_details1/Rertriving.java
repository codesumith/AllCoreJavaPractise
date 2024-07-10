package com.sumith.createdbtableEmployee_insert_display_details1;

import java.sql.*;

public class Rertriving {

	public static void main(String[] args) {
		
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
		Statement stm= con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from Employee56");
		
		
		while(rs.next())
		{
			System.out.println(
					rs.getString(1)+"\t"+
			        rs.getString(2)+"\t"+
					rs.getString(3)+"\t"+
			        rs.getDouble(4)
					);
		}
		
		con.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
