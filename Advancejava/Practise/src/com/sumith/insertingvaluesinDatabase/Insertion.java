package com.sumith.insertingvaluesinDatabase;

import java.util.*;
import java.sql.*;

public class Insertion {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s;)
		{
			try 
			{
				
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise",
													   "root",
													   "Sumith@349"
					      							  );
			
			Statement stm=con.createStatement();
			
			System.out.print("Enter CustomerID :");
			String CID =s.nextLine();
			
			System.out.print("Enter CustomerName :");
			String CName =s.nextLine();
			
			System.out.print("Enter CustomerCity :");
			String City =s.nextLine();
			
			System.out.print("Enter CustomerMail-ID :");
			String Mail_ID =s.nextLine();
			
			System.out.print("Enter CustomerPhnNo :");
			long PhnNo =s.nextLong();
			
			int k=stm.executeUpdate("insert into Customer56 values('"+CID+"','"+CName+"','"+City+"','"+Mail_ID+"',"+PhnNo+")");
			
			System.out.println("Value of k:"+k);
			
			if(k>0)
			{
				System.out.println("Record inserted successfully...");
			}
			
			con.close();
			
			
			}//end of try
			
			catch(SQLIntegrityConstraintViolationException e)
			{
				System.out.println("Record already existed...");
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}// end of try with resource
		
	}

}
