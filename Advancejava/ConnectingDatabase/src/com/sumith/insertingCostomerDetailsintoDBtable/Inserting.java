package com.sumith.insertingCostomerDetailsintoDBtable;

import java.util.*;
import java.sql.*;

public class Inserting {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		try(s;)
		{
            try
            {
            	Class.forName("com.mysql.cj.jdbc.Driver");
            	
            	Connection con =DriverManager.getConnection(
            												"jdbc:mysql://localhost:3306/practise",
            												"root",
            												"Sumith@349"
            												);
            	
            	Statement stm=con.createStatement();
            	
            	System.out.print("Enter CustomerID :");
            	String CID=s.nextLine();
            	
            	System.out.print("Enter CustomerName :");
            	String CName=s.nextLine();
            	
            	System.out.print("Enter CustomerCity :");
            	String City=s.nextLine();
            	
            	System.out.print("Enter CustomerMailID :");
            	String MAIL_ID=s.nextLine();
            	
            	System.out.print("Enter CustomerPhnNo :");
            	long PhnNo=s.nextLong();
            	
            	int k=stm.executeUpdate("insert into Customer56 values('"+CID+"','"+CName+"','"+City+"','"+MAIL_ID+"',"+PhnNo+")");
            	
            	System.out.println("Value in k :"+k);
            	if(k>0)
            	{
            		System.out.println("Customer added Succesfully...");
            	}
            	
            	con.close();
            	
            }// end of inner try
            
            catch(Exception e )
            {
            	e.printStackTrace();
            }
	    }//end of  try with resource
		
	}

}
