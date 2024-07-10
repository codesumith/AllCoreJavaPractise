package com.sumith.metadetaOct18;

import java.sql.*;
import java.util.*;

public class ResultMetaDeta2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
			
			PreparedStatement ps= con.prepareStatement("SELECT * FROM Student_info");
			
			ResultSetMetaData rmd=ps.getMetaData();
			
			int noOfColumns =rmd.getColumnCount();
			System.out.println("Table Structure of Student_info\n");
			System.out.println("No Of Columns :"+noOfColumns);
			for(int i=1;i<=noOfColumns;i++)
			{
				System.out.println("Column "+i+" Name : "+rmd.getColumnName(i)+" , Datatype :"+rmd.getColumnTypeName(i));
			}
			
			System.out.println("Enter Student Id :");
			String id= s.nextLine();
			
			System.out.println("Enter Student Name :");
			String nm= s.nextLine();
			
			System.out.println("Enter Student RollNo :");
			int rn= Integer.parseInt(s.nextLine());
			
			System.out.println("Enter Student Address :");
			String ad= s.nextLine();
			
			System.out.println("Enter Student Date of Addmission :");
			String doa= s.nextLine();
			
			
			ps.addBatch("INSERT INTO Student_info Values('"+id+"','"+nm+"','"+rn+"','"+ad+"','"+doa+"')");
			
			int[] k=ps.executeBatch();
			
			for(int l:k) {
			System.out.println("Inserted Successfully..");
			}
			
			s.close();
			con.close();
			
		}
catch(Exception e)
		{
	e.printStackTrace();
		}
	}

}
