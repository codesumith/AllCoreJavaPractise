package com.sumith.Employee56;

import java.util.Scanner;
import java.sql.*;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s;)
		{
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
//				PreparedStatement ps=con.prepareStatement("create table employe56("
//														+"id varchar(10),"
//														+"name varchar(20),"
//														+"desg varchar(20),"
//														+"bsal double(10,2),"
//														+"hra double(10,2),"
//														+"da  double(10,2),"
//														+"totSal double(10,2))");
//				ps.executeUpdate();
				
				PreparedStatement ps1=con.prepareStatement("insert into employe56 values(?,?,?,?,?,?,?)");
				
				PreparedStatement ps2=con.prepareStatement("select * from employe56");

				PreparedStatement ps3=con.prepareStatement("select * from employe56 where id=?");

				
				
				while(true)
				{
					System.out.println("***Choice**");
					System.out.println("\t1.AddEmployee"
									  +"\n\t2.ViewAll_Employees"
									  +"\n\t3.ViewEmployeeByCode"
									  +"\n\t4.Exit");
					System.out.println("Select your choice :");
					
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						System.out.println("---EmploueeDetails---");
						
						System.out.println("Enter EmployeeId :");
						String Eid=s.nextLine();
						
						System.out.println("Enter EmployeeName :");
						String EName=s.nextLine();
						
						System.out.println("Enter EmployeeDesignation :");
						String EDesign=s.nextLine();
						
						System.out.println("Enter EmployeeBasicSalary :");
						double Bsal=Double.parseDouble(s.nextLine());
						
						System.out.println("Enter Employee-HRA :");
						double hra=Double.parseDouble(s.nextLine());
						
						System.out.println("Enter Employee-DA :");
						double da=Double.parseDouble(s.nextLine());
						
						//Total salary
						double totalSal=(Bsal+hra+da);
						
						//loading data to prepared Statement
						
						//Using setter methods
						ps1.setString(1, Eid);
						ps1.setString(2, EName);
					    ps1.setString(3, EDesign);
					    ps1.setDouble(4, Bsal);
					    ps1.setDouble(5, hra);
					    ps1.setDouble(6, da);
					    ps1.setDouble(7, totalSal);
					    
					    int k=ps1.executeUpdate();
					    
					    if(k>0)
					    {
					    	System.out.println("Employee details added Succesfully...");
					    }
					    
						break;
						
					case 2:
						System.out.println("===EmployeeDetails===");
						ResultSet rs1=ps2.executeQuery();
						
						while(rs1.next())
						{
							System.out.println(rs1.getString(1)+"\t"+
									rs1.getString(2)+"\t"+
									rs1.getString(3)+"\t"+
									rs1.getDouble(4)+"\t"+
									rs1.getDouble(5)+"\t"+
									rs1.getDouble(6)+"\t"+
									rs1.getDouble(7)
									);
						}
						break;
						
					case 3:
						
						System.out.println("@@@Employee_Details_By_Code@@@");
						System.out.println("--------------------------------");
						System.out.println("Enter the EmployeeID:");
						String eid= s.nextLine();
						
						ps3.setString(1, eid);
						
						ResultSet rs2=ps3.executeQuery();
						
						if(rs2.next())
						{
							System.out.println(rs2.getString(1)+"\t"+
									rs2.getString(2)+"\t"+
									rs2.getString(3)+"\t"+
									rs2.getDouble(4)+"\t"+
									rs2.getDouble(5)+"\t"+
									rs2.getDouble(6)+"\t"+
									rs2.getDouble(7)
									);
						}
						else
						{
							System.out.println("ID Doesnot exist...");
						}
						
						
						break;
						
					case 4:
						System.out.println("Operation stopped...");
						con.close();
						System.exit(0);
						break;
						
					default :
						System.out.println("Invalid input");
						
					}
					
				}
				
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}// end of try with resource

	}

}
