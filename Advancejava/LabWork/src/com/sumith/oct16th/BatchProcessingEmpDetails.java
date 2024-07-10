package com.sumith.oct16th;

import java.util.*;
import java.sql.*;

public class BatchProcessingEmpDetails {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
		
		try(s)
		{
			
			try
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
				
     			PreparedStatement ps=con.prepareStatement("Select * From Employee_Info");
				
				System.out.println("--Inserting Employee Details--\n");
				System.out.println("Enter Employee Id :");
				String eid=s.nextLine();
				
				System.out.println("Enter Employee Name :");
				String en=s.nextLine();
				
				System.out.println("Enter Employee Salary ");
				float esal=Float.parseFloat(s.nextLine());
				
				System.out.println("Enter Employee Address :");
				String eadd=s.nextLine();
				
				System.out.println("Enter Employee Mail-ID :");
				String mid=s.nextLine();
				
				System.out.println("Enter Employee PhoneNo :");
				long phn=Long.parseLong(s.nextLine());
				System.out.println();
				ps.addBatch("INSERT INTO Employee_Info VALUES('"+eid+"','"+en+"','"+esal+"','"+eadd+"','"+mid+"','"+phn+"')");
				
				System.out.println("--Update employee salary with the help of eid--");
				
				//ResultSet rs =ps.executeQuery();
				
				System.out.println("Enter ID:");
				String id=s.nextLine();
				
				System.out.println("Enter Employee Salary ");
				float sal=Float.parseFloat(s.nextLine());
				System.out.println();
				ps.addBatch("UPDATE Employee_Info SET Salary='"+sal+"' WHERE Id ='"+id+"'");
				
				System.out.println("--Delete employee who is getting min salary.--\n");
				
		        ps.addBatch("DELETE FROM Employee_Info WHERE Salary=(SELECT minSalary FROM (SELECT MIN(Salary) AS minSalary FROM Employee_Info) AS subquery)");
				
				int []a=ps.executeBatch();
				
				for(int b : a)
				{
					System.out.println("Excecuted Succesfully...");
				}
				
			}//end of try 
			catch(Exception e) {e.printStackTrace();}
			
		}//end of try with resource
		
	}

}
