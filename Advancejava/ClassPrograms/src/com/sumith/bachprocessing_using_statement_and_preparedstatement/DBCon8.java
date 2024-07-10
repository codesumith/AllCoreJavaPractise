package com.sumith.bachprocessing_using_statement_and_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBCon8 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		try(s;)
		{
			
			try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
//		PreparedStatement ps= con.prepareStatement("create table Course56("
//													+"cid varchar(10),"
//													+"cname varchar(15),"
//													+"tname varchar(15),"
//													+"duration varchar(10),"
//													+"primary key(cid))");
//		
//		ps.executeUpdate();
		
		PreparedStatement ps1= con.prepareStatement("insert into Course56 values(?,?,?,?)");
		
		System.out.println("Enter the number course Details :");
		int n=Integer.parseInt(s.nextLine());
		
		System.out.println("Enter "+n+" course details...");
		
		System.out.println("------------------------------------------");
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the CourseID :");
			ps1.setString(1, s.nextLine());
			
			System.out.println("Enter the CourseName :");
			ps1.setString(2, s.nextLine());
			
			System.out.println("Enter the TrainerName :");
			ps1.setString(3, s.nextLine());
			
			System.out.println("Enter the CourseDuration :");
			ps1.setInt(4, Integer.parseInt(s.nextLine()));
			
			ps1.addBatch();
			
			System.out.println("--------------------Added----------------------");
		}//end of loop
		
		int k[]=ps1.executeBatch();
		
		for(int i=0;i<k.length;i++)
		{
			System.out.println(". Executed Successfully..");
		}
		
		ps1.clearBatch();
		con.close();
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}
