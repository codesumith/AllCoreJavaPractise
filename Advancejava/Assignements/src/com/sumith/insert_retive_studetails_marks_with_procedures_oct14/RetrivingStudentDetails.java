package com.sumith.insert_retive_studetails_marks_with_procedures_oct14;

import java.util.*;
import java.sql.*;

public class RetrivingStudentDetails {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
		
		try(s)
		{
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
				System.out.println("Enter Roll No:");
				int rn=Integer.parseInt(s.nextLine());
				
				CallableStatement cs=con.prepareCall("{CALL retrieveStuDetails56(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
				
				cs.setInt(1, rn);
				cs.registerOutParameter(2, Types.VARCHAR);
				cs.registerOutParameter(3, Types.VARCHAR);
				cs.registerOutParameter(4, Types.VARCHAR);
				cs.registerOutParameter(5, Types.VARCHAR);
				cs.registerOutParameter(6, Types.INTEGER);
				cs.registerOutParameter(7, Types.VARCHAR);
				cs.registerOutParameter(8, Types.BIGINT);
				cs.registerOutParameter(9, Types.TINYINT);
				cs.registerOutParameter(10, Types.TINYINT);
				cs.registerOutParameter(11, Types.TINYINT);
				cs.registerOutParameter(12, Types.TINYINT);
				cs.registerOutParameter(13, Types.TINYINT);
				cs.registerOutParameter(14, Types.TINYINT);
				cs.registerOutParameter(15, Types.SMALLINT);
				cs.registerOutParameter(16, Types.FLOAT);
				cs.registerOutParameter(17, Types.VARCHAR);
				
				cs.execute();
				
				System.out.println("---Telangana Board of Education---");
				
				System.out.println("RollNo : "+rn
						+ "\nName     : "+cs.getString(2)
						+ "\nBranch   : "+cs.getString(3)
						+ "\nCity     : "+cs.getString(4)
						+ "\nState    : "+cs.getString(5)
						+ "\nPinCode  : "+cs.getInt(6)
						+ "\nmID      : "+cs.getString(7)
						+ "\nPhNo     : "+cs.getLong(8)
						+ "\nTotM     : "+cs.getShort(15)
						+ "\nPer      : "+cs.getFloat(16)
						+ "\nResult   : "+cs.getString(17));
				
				System.out.println("Enter 1. to view marks\n"+"ELSE  2. to view only Resultint");
				int i=s.nextInt();
				
				if(i==1)
				{
					System.out.println("Telugu  : "+cs.getShort(9)
					                  +"\nHindi   : "+cs.getShort(10)
					                  +"\nEnglish : "+cs.getShort(11)
					                  +"\nMaths   : "+cs.getShort(12)
					                  +"\nScience : "+cs.getShort(13)
					                  +"\nSocial  : "+cs.getShort(14));
				}
				
				System.out.println("Student Details Retrived Successfull");
				
			}//end of try
			catch(Exception e) {e.printStackTrace();}
			
		}//end of try with resource	

	}

}
