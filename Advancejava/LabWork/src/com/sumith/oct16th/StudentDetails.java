package com.sumith.oct16th;

import java.util.*;
import java.sql.*;

public class StudentDetails {

	public static void main(String[] args) {
		
Scanner s= new Scanner(System.in);

try(s)
{
	
	try
	{
		//it will load and register the mysql jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
		
		System.out.println("-----Student-Details-----\n");
		System.out.println("Enter your ID :");
		String id= s.nextLine();
		
		System.out.println("Enter your RollNo :");
		int rn =Integer.parseInt(s.nextLine());
		
		System.out.println("Enter your Name :");
		String sn= s.nextLine();
		
		System.out.println("Enter your Branch :");
		String sb= s.nextLine();
		
		System.out.println("Enter your HouseNo :");
		String hn= s.nextLine();
		
		System.out.println("Enter your City :");
		String cty= s.nextLine();
		
		System.out.println("Enter your PinCode :");
		int pin =Integer.parseInt(s.nextLine());
		
		System.out.println("Enter your MailID :");
		String mid= s.nextLine();
		
		System.out.println("Enter your PhoneNo :");
		long phn= s.nextLong();
		
		CallableStatement cs= con.prepareCall("{CALL InsertStudentDetails(?,?,?,?,?,?,?,?,?)}");
		cs.setString(1, id);
		cs.setInt(2, rn);
		cs.setString(3,sn);
		cs.setString(4, sb);
		cs.setString(5, hn);
		cs.setString(6, cty);
		cs.setInt(7,pin);
		cs.setString(8,mid);
		cs.setLong(9, phn);
		
		cs.execute();
		
		System.out.println("Inserted Succesfully");
		
	}//end of try
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}//end of try with resource

	}

}
