package com.sumith.labwork17Oct;

import java.util.*;
import java.sql.*;

public class RetrivingStuData_Procedure {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		try(s)
		{
		
			try
			{
				// it will load or register the mysql jdbc Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//it will establish connection between java application and mysql database
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
				
				System.out.println("--Retriving-Details--\n");
				
				System.out.println("Enter student id :");
				String id=s.nextLine();
				
				CallableStatement cs= con.prepareCall("{CALL DisplayStudentDetails(?,?,?,?,?,?,?,?,?)}");

				cs.setString(1, id);
				cs.registerOutParameter(2, Types.INTEGER);
				cs.registerOutParameter(3, Types.VARCHAR);
				cs.registerOutParameter(4, Types.VARCHAR);
				cs.registerOutParameter(5, Types.VARCHAR);
				cs.registerOutParameter(6, Types.VARCHAR);
				cs.registerOutParameter(7, Types.INTEGER);
				cs.registerOutParameter(8, Types.VARCHAR);
				cs.registerOutParameter(9, Types.BIGINT);
				
				cs.execute();
				
				System.out.println("--StudentDetails--");
				System.out.println("ID : "+id+
						           "\nRoll No : "+cs.getInt(2)+
						           "\nName : "+cs.getString(3)+
						           "\nBranch : "+cs.getString(4)+
						           "\nHouse No : "+cs.getString(5)+
						           "\nCity : "+cs.getString(6)+
						           "\nPinCode : "+cs.getString(7)+
						           "\nMail-Id : "+cs.getString(8)+
						           "\nPhone : "+cs.getLong(9));


			}//end of try 
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource
		
		
	}

}
