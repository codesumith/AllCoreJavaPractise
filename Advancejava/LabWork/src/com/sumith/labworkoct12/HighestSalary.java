package com.sumith.labworkoct12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HighestSalary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
			
			PreparedStatement ps=con.prepareStatement("select distinct totSal from employe56 order by totSal desc limit ?,1");
			
			System.out.println("Enter the number to find nth highest salary:");
			int hs=s.nextInt();
			
			ps.setInt(1, hs);
			
			ResultSet rs1 =ps.executeQuery();
			
			
			
			if(rs1.next())
			{
			     System.out.println("Nth highest salary :"+
									rs1.getDouble(1)
									);
			}
			else {
				System.out.println("Not found...");
			}
			
		}//end of try
		catch(Exception e) {e.printStackTrace();}
		
	}//end of try with resource
	}

}
