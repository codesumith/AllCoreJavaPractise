package com.sumith.createdbtableEmployee_insert_display_details1;

import java.sql.*;

public class Creation {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practise",
		    		                                     "root",
		    											 "Sumith@349");
		    
		    Statement stm=con.createStatement();
		    
//		    String st="CREATE TABLE Employee56("
//						+"EID VARCHAR(10), "
//						+"EName VARCHAR(15), "
//						+"EDedg VARCHAR(15), "
//						+"TotalSal DOUBLE(15,3), "
//						+"PRIMARY KEY (EID)) ";
//		    
//		    stm.execute(st);
		    
		               stm.executeUpdate("CREATE TABLE Employee56("
				   						+"EID VARCHAR(10), "
				   						+"EName VARCHAR(15), "
				   						+"EDedg VARCHAR(15), "
				   						+"TotalSal DOUBLE(15,3), "
				   						+"PRIMARY KEY (EID)) ");
		   
		  
		   System.out.println("Table Created Successfully...");
		  
		   //rs.close();
		   con.close();
		    		                                               		
		}//end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
