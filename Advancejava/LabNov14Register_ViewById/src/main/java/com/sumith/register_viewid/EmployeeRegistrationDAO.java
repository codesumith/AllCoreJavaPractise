package com.sumith.register_viewid;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeRegistrationDAO {
	
	Connection con =new DBConnection().getcon();
	int k=0;
	
	public int insert(Employee e)
	{
		try {
			PreparedStatement ps =con.prepareStatement("INSERT INTO EmpDetails Values(?,?,?,?)");
			
			ps.setString(1, e.getId());
			ps.setString(2, e.getName());
			ps.setDouble(3, e.getSalary());
			ps.setString(4, e.getAddress());
			
			 k =ps.executeUpdate();
			
		} catch (Exception e1) {e1.printStackTrace();}
		
		return k;
		
	}

}
