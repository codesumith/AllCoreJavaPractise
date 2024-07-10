package com.sumith.Test_Oct14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeeInfo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		try(s;)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
				PreparedStatement ps1= con.prepareStatement("Select * from EmployeeInfo");
				
				
						
					System.out.println("1.Insert data into Employee Table.");	
					
					System.out.println("Enter EmpId:");
					String eid =s.nextLine();
					
					System.out.println("Enter EmpName:");
					String eName =s.nextLine();
					
					System.out.println("Enter EmpSalary:");
					float esal =Float.parseFloat(s.nextLine());
					
					System.out.println("Enter EmpAddress:");
					String eAddress =s.nextLine();
					
					System.out.println("Enter MailId:");
					String mail =s.nextLine();
					
					System.out.println("Enter EmpPhnNo:");
					long phn =Long.parseLong(s.nextLine());
					
					ps1.addBatch("Insert into Employee_Info values('"+eid+"','"+eName+"','"+esal+"','"+eAddress+"','"+mail+"','"+phn+"')");
					
					System.out.println("2.Update empAddress,empMailId and empPhNo with the help of empId.");
					
					System.out.println("Enter EmpId to update details:");
					String eid1 =s.nextLine();
					
					System.out.println("Enter EmpAddress update details:");
					String eAddress1 =s.nextLine();
					
					System.out.println("Enter MailId update details:");
					String mail1 =s.nextLine();
					
					System.out.println("Enter EmpPhnNo update details:");
					long phn1 =Long.parseLong(s.nextLine());
					
					ps1.addBatch("update Employee_Info set empAddress='"+eAddress1+"',empMailId ='"+mail1+"',empPhNo='"+phn1+"' where empId='"+eid1+"'");
					
					System.out.println("3.delete employee who is getting salary between 10000 to 20000.");
					
					ps1.addBatch("Delete from Employee_Info Where empSalary > 10000.00 AND empSalary < 20000.00");
					
					int k[]=ps1.executeBatch();
					
					for(int i:k)
					{
						System.out.println("Exceuted Succesfully..");
					}
					
			}//end of try
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}//end of try with resource

	}

}
