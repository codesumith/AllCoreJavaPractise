package com.sumith.testnov4;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//import com.sumith.getDataBaseConnection.Jdbc;

public class Pg1EmployeeInfo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
			
			PreparedStatement ps=con.prepareStatement("INSERT INTO emp_infot VALUES(?,?,?,?,?)");
			
			System.out.println("Enter EmployeeID:");
			String empId=s.nextLine();
			System.out.println("Enter EmployeeName:");
			String empName =s.nextLine();
			System.out.println("Enter EmployeeSalary:");
			int empSal=Integer.parseInt(s.nextLine());
			//System.out.println("Enter EmployeeImage/Path:");
			
			FileInputStream fis =new FileInputStream(new File("/Users/sumith/Desktop/JavaIoFiles/a.jpg"));
			byte [] b=fis.readAllBytes();
			
			System.out.println("Enter EmployeeDOB:");
			String dob=s.nextLine();
			
		
			
			ps.setString(1, empId);
			ps.setString(2, empName);
			ps.setInt(3, empSal);
			ps.setBytes(4, b);
			ps.setString(5, dob);
			
			ps.execute();
			
			System.out.println("Inserted Succesfully");
			
		}

		catch(Exception e) {e.printStackTrace();}
	}

}
