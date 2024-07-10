package com.sumith.userLoginSystemOct11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginApplication {
	
	
	//CREATING TABLE
	public void creatingTable(Connection con) throws SQLException
	{
		
		PreparedStatement ps=con.prepareStatement("create table USER("
												 +"USERNAME varchar(15),"
												 +"PASSWORD varchar(15),"
												 +"primary key (USERNAME))");
		ps.executeUpdate();
		
		
			System.out.println("Table created Successfully...");
		
	}
	
	//INSERINTG DETAILS
	public void insertUsernamesAndPasswords(Connection con,Scanner scanner) throws SQLException
	{
		PreparedStatement ps=con.prepareStatement("insert into USER values(?,?)");
		
		while(true)
		{
			System.out.println("***Choice***");
			System.out.println("\t1.Register Username and Password."
							  +"\n\t2.Exit.");
			System.out.println("Enter your choice :");
			
			switch(Integer.parseInt(scanner.nextLine()))
			{
			case 1:
				System.out.println("Enter Username :");
				String uname=scanner.nextLine();
				
				System.out.println("Enter Username :");
				String pswd=scanner.nextLine();
				
				ps.setString(1,uname);
				ps.setString(2,pswd);
				
				int k=ps.executeUpdate();
				
				if( k>0)
				{
					System.out.println("Registered succesfully...");
				}
				break;
			case 2:
				System.out.println("Operation stopped...");
				System.exit(0);
				break;
				
				default :
					System.out.println("Inavalid Choice..");
				
			}//end of switch
			
		}//end of loop
	}
	
	public boolean checkLogin(Connection con,String userName, String Password) throws SQLException
	{
		boolean validation=false;
		
		PreparedStatement ps=con.prepareStatement("select * from USER where USERNAME=? and PASSWORD=?");
		
		ps.setString(1, userName);
		ps.setString(2, Password);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			validation=true;
		}
		
		return validation;
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		LoginApplication l=new LoginApplication();
		
		try(s;)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
				//l.creatingTable(con);
				
				while(true)
				{
					System.out.println("***Choice***");
					System.out.println("\t1.Register.."
						          +"\n\t2.Login."
								  +"\n\t3.Exit."); 	
					System.out.println("Enter your choice :");
				
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						l.insertUsernamesAndPasswords(con, s);
						break;
						
					case 2:
						System.out.println("Enter UserName :");
						String un=s.nextLine();
						
						System.out.println("Enter PassWord :");
						String pw=s.nextLine();
						
						if(l.checkLogin(con, un, pw))
						{
							System.out.println("Welcome to Nothing...");
						}
						else
						{
							System.out.println("Invalid Login Credantials...");
						}
						break;
						
					case 3:
						System.out.println("Operation stopped...");
						System.exit(0);
						break;
						
					}//end of switch
				}//end of loop
	
			}//end of try
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
    	}//end of try with resource.

	}

}
