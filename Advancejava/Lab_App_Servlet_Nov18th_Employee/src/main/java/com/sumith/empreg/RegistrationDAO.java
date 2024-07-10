package com.sumith.empreg;

import java.sql.*;
public class RegistrationDAO {

	int k =0;
	
	public int register(EmployeeBean eb)
	{
		
	   Connection con =new DBConnection().getcon();
	   try {
		  PreparedStatement ps =con.prepareStatement("INSERT INTO EmpDetail Values(?,?,?,?,?,?,?,?)");
		  ps.setString(1, eb.getEname());
		  ps.setString(2, eb.getEid());
		  ps.setString(3, eb.getFname());
		  ps.setString(4, eb.getLname());
		  ps.setString(5, eb.getMid());
		  ps.setString(6, eb.getPhn());
		  ps.setString(7, eb.getState());
		  ps.setString(8, eb.getCountry());
		  
		  k=ps.executeUpdate();
		  
	   }catch(Exception e) {e.printStackTrace();}
		return k;
		
	}
	
}
