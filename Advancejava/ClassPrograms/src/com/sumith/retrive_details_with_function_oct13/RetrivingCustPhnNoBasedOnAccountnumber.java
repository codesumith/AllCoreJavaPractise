package com.sumith.retrive_details_with_function_oct13;

import java.util.*;
import java.sql.*;

public class RetrivingCustPhnNoBasedOnAccountnumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s)
		{
			try
			{
		//it will load and register a mysql jdbc Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//it will establish connection between java application and mysql database
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
		System.out.println("Enter Account No:");
		long ac=s.nextLong();
		
		CallableStatement cs= con.prepareCall("{? = CALL RetrievePhnNo56(?)}");
		
		cs.registerOutParameter(1,Types.BIGINT);
		cs.setLong(2, ac);
		
		cs.execute();
		
		System.out.println("AccountNumber :"+ac+"\tPhnNO :"+cs.getLong(1));
		
		con.close();
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}
