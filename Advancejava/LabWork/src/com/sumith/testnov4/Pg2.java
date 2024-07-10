package com.sumith.testnov4;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Pg2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
			
			PreparedStatement ps=con.prepareStatement("Select * From emp_infot");
			
			
			
			
		     ResultSet rs=ps.executeQuery();
			
			
			rs.next();
			FileOutputStream fos =new FileOutputStream(new File("/Users/sumith/Desktop/JavaIoFiles/new.jpg"));
			
			fos.write(rs.getBytes(4));
			
		
			
			
			
			System.out.println("Retrived Succesfully");
			
		}

		catch(Exception e) {e.printStackTrace();}

	}

}
