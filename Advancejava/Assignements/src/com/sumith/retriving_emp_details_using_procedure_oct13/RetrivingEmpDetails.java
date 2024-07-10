package com.sumith.retriving_emp_details_using_procedure_oct13;

import java.util.*;
import java.sql.*;

public class RetrivingEmpDetails {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		try(s)
		{
		
			try
			{
				//it will load or register the mysql jdbc Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//it will establish connection between java application and mysql database
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
		System.out.println("Enter Employee id to view employee detalis :");
		String eid=s.nextLine();
		
		CallableStatement cs =con.prepareCall("{CALL retrieveEmp56(?,?,?,?,?,?,?,?)}");
		
		cs.setString(1, eid);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.registerOutParameter(3, Types.VARCHAR);
		cs.registerOutParameter(4, Types.VARCHAR);
		cs.registerOutParameter(5, Types.VARCHAR);
		cs.registerOutParameter(6, Types.INTEGER);
		cs.registerOutParameter(7, Types.VARCHAR);
		cs.registerOutParameter(8, Types.BIGINT);
		
		cs.execute();
		
		System.out.println("---Employee-Details---"+
	                        "\nID          :"+eid+
	    		  			"\nName        :"+cs.getString(2)+
	    		  			"\nDesignation :"+cs.getString(3)+
	    		  			"\nCity        :"+cs.getString(4)+
	    		  			"\nState       :"+cs.getString(5)+
	    		  			"\nPinCode     :"+cs.getInt(6)+
	    		  			"\nMail-Id     :"+cs.getString(7)+
	    		  			"\nPhnNo       :"+cs.getLong(8));
		
		con.close();
			}// end of try
			catch(Exception e) {e.printStackTrace();}
		
		}//end of try with resource
		
	}

}
