package com.sumith.labwork17Oct;

//import java.util.*;
import java.sql.*;

import java.util.Scanner;

public class RetriveSal_with_Function {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		try(s)
		{
		
			try
			{
            Class.forName("com.mysql.cj.jdbc.Driver");
				
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
			
			System.out.println("Enter Employee ID:");
			String eid =s.nextLine();
			
			CallableStatement cs=con.prepareCall("{? = CALL emp_info(?)}");
			
			cs.registerOutParameter(1, Types.FLOAT);
			cs.setString(2, eid);
			
			cs.execute();
			
			System.out.println("Employee Id : "+eid+"\tSalary :"+cs.getFloat(1));
				
			}//end of try 
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}//end of try with resource
	}

}
