package com.sumith.statement;

import java.sql.*;

public class ConnectingDataBase {

	public static void main(String[] args) {
		
	
        try {
        	//  step-1 LoadingDriver	
        
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step-2 Creating Connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise",
												   "root",
												   "Sumith@349");

		//step-3 Preparing Statement
		
		Statement stm=con.createStatement();
		
		//step-4 Executing Queries
		
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
		
		//step-5 Closing connection
		
		con.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
