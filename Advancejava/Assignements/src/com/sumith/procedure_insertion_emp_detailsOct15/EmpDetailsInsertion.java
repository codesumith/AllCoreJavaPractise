package com.sumith.procedure_insertion_emp_detailsOct15;

import java.util.*;
import java.sql.*;

public class EmpDetailsInsertion {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s)
		{
			
			try
			{
				
				//Class.forName("com.mysql.cj.jdbc.Driver"); //it will load and register a mysql jdbc driver.
				
				//it will establish connection between java application and mysql database.
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
				System.out.println("---EMPLOYEE-DETAILS---");
				
				System.out.println("Enter EmployeeId :");
				String eid=s.nextLine();
				
				System.out.println("Enter Employee Name :");
				String en=s.nextLine();
				
				System.out.println("Enter Employee Designation :");
				String dsg=s.nextLine();
				
				System.out.println("Enter Employee City :");
				String cty=s.nextLine();
				
				System.out.println("Enter Employee State :");
				String st=s.nextLine();
				
				System.out.println("Enter Employee PinCode :");
				int pinc=Integer.parseInt(s.nextLine());
				
				System.out.println("Enter Employee MailID :");
				String mid=s.nextLine();
				
				System.out.println("Enter Employee PhnNo :");
				long phn=Long.parseLong(s.nextLine());
				
				System.out.println("Enter Employee BasicSalary :");
				float bas=Float.parseFloat(s.nextLine());
				
				System.out.println("Enter Employee Total Salary :");
				float tsal=s.nextFloat();
				
				CallableStatement cs=con.prepareCall("{CALL InsertEmpDetails56(?,?,?,?,?,?,?,?,?,?)}");
				
				cs.setString(1, eid);
				cs.setString(2, en);
				cs.setString(3, dsg);
				cs.setString(4, cty);
				cs.setString(5, st);
				cs.setInt(6, pinc);
				cs.setString(7, mid);
				cs.setLong(8, phn);
				cs.setFloat(9, bas);
				cs.setFloat(10, tsal);
				
				cs.execute();
				
					System.out.println("Procedure Executed Successfully...");
				
				con.close();
			}//end of try 
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}// end try with resource


	}

}
