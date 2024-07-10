package com.sumith.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import com.sumith.getDataBaseConnection.Jdbc;

public class DBCon9 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		try(s)
		{
			
			try
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver");// it will load and register a mysql jdbc driver 
				
				
				//used to establish a database connection from a java application to mysql database
				Connection con =Jdbc.getConnection();
						//DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				

				System.out.println("Enter Customer AccountNumber:");
				long ac=Long.parseLong(s.nextLine());
				
				System.out.println("Enter Customer Name:");
				String cn=s.nextLine();
				
				System.out.println("Enter AccountBalance:");
				float bl=Float.parseFloat(s.nextLine());
				
				System.out.println("Enter Customer Account Type:");
				String at=s.nextLine();
				
				System.out.println("Enter Customer City:");
				String cty=s.nextLine();
				
				System.out.println("Enter Customer State:");
				String st=s.nextLine();
				
				System.out.println("Enter Customer PINCode:");
				int pinC=Integer.parseInt(s.nextLine());
				
				System.out.println("Enter Customer MailID:");
				String md=s.nextLine();
				
				System.out.println("Enter Customer PhnNo:");
				long phn=s.nextLong();
				
				
				CallableStatement cl=con.prepareCall("{call InsertCust56(?,?,?,?,?,?,?,?,?)}");
	
				cl.setLong(1, ac);
				cl.setString(2,cn);
				cl.setFloat(3, bl);
				cl.setString(4,at);
				cl.setString(5,cty);
				cl.setString(6,st);
				cl.setInt(7, pinC);
				cl.setString(8,md);
				cl.setLong(9, phn);
				
				cl.execute();
				
				System.out.println("Procedure Successfully...");
				con.close();
				
			}// end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}//end of try with resource
		

	}

}
