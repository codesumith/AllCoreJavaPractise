package com.sumith.labworkoct12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DepartmentEmployees {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
		PreparedStatement ps1=con.prepareStatement("Select * from employe56 where desg=?");
		
	System.out.println("Enter Designation to view employee details :");
	String desg=s.nextLine();
	
	ps1.setString(1, desg);
	
	ResultSet rs=ps1.executeQuery();
	
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"\t"+
							rs.getString(2)+"\t"+
							rs.getString(3)+"\t"+
							rs.getDouble(4)+"\t"+
							rs.getDouble(5)+"\t"+
							rs.getDouble(6)+"\t"+
							rs.getDouble(7));
	}//end of loop
	
			}//end of try
			
			catch(Exception e) {e.printStackTrace();}
			
		}//end of try with resource
		
	}

}
