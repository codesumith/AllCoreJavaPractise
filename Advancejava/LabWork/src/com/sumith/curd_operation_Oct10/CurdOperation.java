package com.sumith.curd_operation_Oct10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CurdOperation {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s;)
		{
			
			try
			{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
//		PreparedStatement ps=con.prepareStatement("create table StudentDetails56("
//												 +"StudentID varchar(10),"
//												 +"Name varchar(15),"
//												 +"PhoneNumber bigint(15),"
//												 +"StudentCity varchar(15),"
//												 +"primary key (StudentID))");
//		
//		ps.executeUpdate();

		PreparedStatement ps1=con.prepareStatement("insert into StudentDetails56 values(?,?,?,?)");
		
		PreparedStatement ps2=con.prepareStatement("delete from StudentDetails56 where StudentID=?");
		
		PreparedStatement ps3=con.prepareStatement("select * from StudentDetails56 where StudentId=?");
		
		while(true)
		{
			System.out.println("***CHOICE***");
			System.out.println("\t1.AddStudentDetails."
							  +"\n\t2.DeleteStudentDetails."
							  +"\n\t3.PrintStudentDetails"
							  +"\n\t4.Exit.");
			System.out.println("Enter your choice:");
			
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:
				System.out.println("---StudentDetails---");
				
				System.out.println("Enter StudentId :");
				String sId=s.nextLine();
				
				System.out.println("Enter StudentName :");
				String sName=s.nextLine();
				
				System.out.println("Enter PhnNo :");
				long phnNo=Long.parseLong(s.nextLine());
				
				System.out.println("Enter Address :");
				String sCity=s.nextLine();
				
				ps1.setString(1, sId);
				ps1.setString(2, sName);
				ps1.setLong(3, phnNo);
				ps1.setString(4, sCity);
				
				int k1=ps1.executeUpdate();
				
				if(k1>0)
				{
					System.out.println("Student details updated Successfully...");
				}
				
				break;
				
			case 2:
				
				System.out.println("Enter studentID :");
				String stdID=s.nextLine();
				
				ps2.setString(1, stdID);
				
				int k2 =ps2.executeUpdate();
				
				if(k2>0)
				{
					System.out.println("Student details deleted succesfully...");
				}
				else
				{
					System.out.println("Invalid studentId");
				}
				break;
				
			case 3:
				
				System.out.println("Enter studentID :");
				String stdID3=s.nextLine();
				
				ps3.setString(1, stdID3);
				
				ResultSet rs=ps3.executeQuery();
				
				if(rs.next())
				{
					System.out.println(rs.getString(1)+"\t"+
							           rs.getString(2)+"\t"+
							           rs.getLong(3)+"\t"+
					                   rs.getString(4));
				}
				else
				{
					System.out.println("Invalid studentId");
				}
				
				break;
				
			case 4:
				System.out.println("Operation ended...");
				System.exit(0);
				break;
				
				
			}//end of switch
			
			
		}//end of loop
		
		
		
			}// end of try
			
			catch(Exception e)
			{
				e.printStackTrace();
			}

		}//end of try with resource
	}

}
