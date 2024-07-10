package com.sumith.labworkoct12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdationForStudentDetails {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");

PreparedStatement ps= con.prepareStatement("update student set StudentName=?,StudentAddress=? where StudentPhnNo=?");

PreparedStatement ps1= con.prepareStatement("select * from student where StudentPhnNo=?");



while(true)
{
	System.out.println("***Choice***");
System.out.println("\t1.UpdateDetails."
		+"\n\t2.Exit.");
System.out.println("Enter your choice:");
switch(Integer.parseInt(s.nextLine()))
{
case 1:
	System.out.println("Enter StudentPhnNo:");
	double pn=Double.parseDouble(s.nextLine());
	
	ps1.setDouble(1, pn);
	ResultSet rs=ps1.executeQuery();
	
	while(rs.next())
	{
	
	System.out.println("Old name:"+rs.getString(1));
	System.out.println("Enter new name:");
	String nn=s.nextLine();
	
	System.out.println("Old Address:"+rs.getString(2));
	System.out.println("Enter new Address:");
	String nad=s.nextLine();
	
	ps.setString(1, nn);
	ps.setString(2, nad);
	ps.setDouble(3, pn);
	
	int k=ps.executeUpdate();
	if(k>0)
	{
		System.out.println("Student details updated..");
	}
	}
	break;
case 2:
	System.out.println("Operation stopped...");
	System.exit(0);
	break;
	default :
		System.out.println("Invalid choice...");
}


System.out.println();

System.out.println("");
}
			}//end of try
			
			catch(Exception e){e.printStackTrace();}
		} // end of try wit resource
	}

}
