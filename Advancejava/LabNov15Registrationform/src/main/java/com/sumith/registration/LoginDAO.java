package com.sumith.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    String k;
	public String check(EmployeeBean eb)
	{
		Connection con =new DBConnection().getcon();
		try {
			PreparedStatement ps =con.prepareStatement("Select * from EmpDetail Where EmployeeName = ? AND Id = ?");
			
		 ps.setString(1, eb.getEmpName());
		 ps.setString(2, eb.getId());
		
		 ResultSet rs =ps.executeQuery();
		 
		 if(rs.next())
		 {
			 k=rs.getString(1);
		 }
		 
		} catch (Exception e) {e.printStackTrace();}
		
		
		return k;
		
	}
	
}