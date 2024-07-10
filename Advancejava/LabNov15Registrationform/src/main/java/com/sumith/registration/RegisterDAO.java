package com.sumith.registration;

import java.sql.*;

public class RegisterDAO {

	int k=0;
	public int insert(EmployeeBean eb)
	{
		Connection con =new DBConnection().getcon();
		try {
			PreparedStatement ps =con.prepareStatement("Insert into EmpDetail values(?,?,?,?,?,?,?,?)");
			
		 ps.setString(1, eb.getEmpName());
		 ps.setString(2, eb.getId());
		 ps.setString(3, eb.getfName());
		 ps.setString(4, eb.getlName());
		 ps.setString(5, eb.getMail());
		 ps.setString(6, eb.getPhno());
		 ps.setString(7, eb.getState());
		 ps.setString(8, eb.getCountry());
		 
		 k=ps.executeUpdate();
		 
		} catch (Exception e) {e.printStackTrace();}
		
		
		return k;
		
	}
	
}
