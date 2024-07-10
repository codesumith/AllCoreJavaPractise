package com.sumith.labworkOct31;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertingPlayersInfo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s;) {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
		
		PreparedStatement ps =con.prepareStatement("INSERT INTO Player_info Values(?,?,?,?)");
		
	
		
		while(true)
		{
			System.out.println("***CHOICE***");
			System.out.println("1.Insert Player Details.\n"
					+ "2.EXIT");
			System.out.println("Enter your Choice :");
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:
				System.out.println("Enter Player Id :");
				String pId=s.nextLine();
				
				System.out.println("Enter Player Name :");
				String pName=s.nextLine();
				
				System.out.println("Enter Player Dob :");
				String pDob=s.nextLine();
				
				System.out.println("Enter Player Image path/filename:");
				FileInputStream fis =new FileInputStream(new File(s.nextLine()));
				
				byte b []=fis.readAllBytes();
				
				ps.setString(1, pId);
				ps.setString(2, pName);
				ps.setString(3, pDob);
				ps.setBytes(4, b);
			
				ps.execute();
				
				System.out.println("Inserted Successfull...");
				
				break;
			case 2 :
				con.close();
				System.out.println("Operation ended ...");
				System.exit(0);
				break;
				default :
					System.out.println("Invalid choice try again ..");
			}
		}
		
		
		}//end of try
		catch(Exception e) {e.printStackTrace();}
		
		
	}

}
