package com.sumith.connection_and_JDBCstatements;

import java.sql.*;


public class StatementAndConnection {

	public static void main(String[] args) {
		
		try {
			
			//step1 loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2 Creating connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Sumith@349");
			
			//step3 Creating statements
			Statement stm=con.createStatement();
			
			//step4 Executing Queries
			ResultSet rs=stm.executeQuery("Select * from Customer56");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getLong(5));
			}
			
			// step5 ClosingConnection
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
