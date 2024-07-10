package com.sumith.labworkOct31;

import java.sql.*;
import java.util.*;
import java.io.*;

public class RetrivingPlayerImage {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		try(s;)
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
		
		PreparedStatement ps =con.prepareStatement("SELECT * FROM Player_info where pId=?");
		System.out.println("Enter Player Id :");
		ps.setString(1, s.nextLine());
		
		ResultSet rs =ps.executeQuery();
		if(rs.next())
		{
			
			System.out.println("Enter file path/addres for storage :");
			FileOutputStream fos =new FileOutputStream(new File(s.nextLine()));
			fos.write(rs.getBytes(4));
			
			System.out.println("Inserted sucessfull...");
		}
		}
		catch(Exception e) {e.printStackTrace();}
		

	}

}
