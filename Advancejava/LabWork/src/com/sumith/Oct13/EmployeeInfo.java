package com.sumith.Oct13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
				
				Statement ps= con.createStatement();
				
				System.out.println("\t1.  1.Insert data into Employee Table.\n");
				
					System.out.println("---EmployeeDetails---");
					System.out.println("Enter EmployeeID :");
					String eid=s.nextLine();
					
					System.out.println("Enter EmployeeName :");
					String eName=s.nextLine();
					
					System.out.println("Enter EmployeeSalary :");
					float eSal=Float.parseFloat(s.nextLine());
					
					System.out.println("Enter EmployeeAddress :");
					String eadd=s.nextLine();
					
					System.out.println("Enter EmailID :");
					String email=s.nextLine();
					
					System.out.println("Enter EmployeePhnNO :");
					long phn=Long.parseLong(s.nextLine());
					
					ps.addBatch("insert into Employee_Info values('"+eid+"','"+eName+"','"+eSal+"','"+eadd+"','"+email+"','"+phn+"')");
					
					System.out.println("+------------+-------------+------+-----+---------+-------+");
					
					System.out.println("2.Update employee salary with the help of eid.");
					
					System.out.println("Enter id to update Salary :");
					String upid=s.nextLine();
					
					System.out.println("Enter new salary for "+upid);
					float sal=Float.parseFloat(s.nextLine());
					
					ps.addBatch("update Employee_Info set empSalary='"+sal+"' where empID='"+upid+"'");
					
//					System.out.println("+------------+-------------+------+-----+---------+-------+");
//					
//					System.out.println(" 3.delete employee who is getting min salary.   ");
//					
//				    ps.addBatch("DELETE FROM Employee_Info WHERE empSalary =(SELECT maxSalary FROM(SELECT MAX(empSalary) As maxSalary FROM Employee_Info) AS subquery)");
	
					int k[] =ps.executeBatch();
					
					for(int i:k)
					{
						System.out.println("Executed Successfully...");
					}
					
ps.close();
con.close();
					
				
				
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}// end of try with resource
		
	}

}
