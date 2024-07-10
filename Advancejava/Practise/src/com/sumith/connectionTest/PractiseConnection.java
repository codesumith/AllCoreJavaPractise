package com.sumith.connectionTest;

import java.sql.*;

public class PractiseConnection {

	public static void main(String[] args) {
		
		try 
		{
		// Step-1 Loading Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step-2 Creating Connection
		
		Connection con=DriverManager.getConnection(
				                                  "jdbc:mysql://localhost:3306/practise",
				                                  "root",
				                                  "Sumith@349"
												  );
		
		// Step-3 Preparing Statements
		
		Statement stm=con.createStatement();
		
		// Step-4 Executing Queries
		
		ResultSet rs=stm.executeQuery("SELECT * FROM Customer56");
		
		while(rs.next())
		{
			System.out.println(
					 		  rs.getString(1)+"\t"+
					 		  rs.getString(2)+"\t"+
					 	      rs.getString(3)+"\t"+
					 		  rs.getString(4)+"\t"+
					 	      rs.getLong(5)
							  );
		}
		
		// Step-5 Closing Connection
		
		con.close();
		
		}// end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
