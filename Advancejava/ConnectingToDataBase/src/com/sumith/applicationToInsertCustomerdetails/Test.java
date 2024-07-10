package com.sumith.applicationToInsertCustomerdetails;

import java.sql.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
				//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Sumith@349");
				
				Statement stm=con.createStatement();
				
				System.out.print("Enter the custID :"); String cId=s.nextLine();
				System.out.print("Enter the custName :"); String cName=s.nextLine();
				System.out.print("Enter the custCity :"); String cCity=s.nextLine();
				System.out.print("Enter the custMailIs :"); String cMail=s.nextLine();
				System.out.print("Enter the custPhoneNo :"); int phno=s.nextInt();
				
				int k=stm.executeUpdate("insert into Customer56 values('"+cId+"','"+cName+"','"+cCity+"','"+cMail+"',"+phno+")");
				
				System.out.println("Vlaue in k:"+k);
				
				if(k>0)
				{
					System.out.println("Customer added");
				}
				con.close();
				
			}//end of try
			
			catch( Exception e)
			{
			e.printStackTrace();
			}//end of try with resource
		}

	}

}
