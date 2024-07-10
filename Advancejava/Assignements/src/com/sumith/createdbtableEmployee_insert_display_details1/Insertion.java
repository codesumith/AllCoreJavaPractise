package com.sumith.createdbtableEmployee_insert_display_details1;

import java.sql.*;
import java.util.Scanner;

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
    
    System.out.print("Enter how many employee details you want to enter:");
    String NoOfEmpDetails=s.nextLine();
    
    int n=Integer.parseInt(NoOfEmpDetails);
    int i=0;
    
    while(i!=n)
    {
    	System.out.print("Enter EmployeeId :");
    	String EID=s.nextLine();
    
    	System.out.print("Enter EmployeeName :");
    	String EName=s.nextLine();
    	
    	System.out.print("Enter EmployeeDesignation :");
    	String EDesg=s.nextLine();
    	
    	System.out.print("Enter EmployeeSalary :");
    	String ESalstr=s.nextLine();
    	double ESal=Double.parseDouble(ESalstr);
    	
    	int k=stm.executeUpdate("insert into Employee56 values('"+EID+"','"+EName+"','"+EDesg+"',"+ESal+")");
    	
    	System.out.println("Value of k :"+k);
    	
    	if(k>0)
    	{
    		System.out.println("Record inserted sucessfully...");
    	}
    	i++;
    }
		}//end of try
		
		catch(Exception e)
		{
	e.printStackTrace();
		}
	}
		}// end of try with resource


}
