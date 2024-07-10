package com.sumith.TransactionMangementOct19;

import java.util.*;
import java.sql.*;

public class DataBaseOperations {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		try(s)
		{
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
				
				System.out.println("Auto Commit :"+con.getAutoCommit());
				
	            con.setAutoCommit(false);
	            
	            System.out.println("Auto Commit :"+con.getAutoCommit());
	            
	            PreparedStatement ps1= con.prepareStatement("Select * From transactions where transaction_id=?");
	            PreparedStatement ps= con.prepareStatement("Update transaction set amount = amount+? where transaction_id=?");
	            
	           
	            while(true)
	            {
	            	
	            	
	            }
			}//end of try
			catch(Exception e) {e.printStackTrace();}
			
		}//end of try with resource
	

	}

}
