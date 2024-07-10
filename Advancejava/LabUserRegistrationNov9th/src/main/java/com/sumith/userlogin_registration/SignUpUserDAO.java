package com.sumith.userlogin_registration;

import java.sql.*;

public class SignUpUserDAO {

	Connection con =new DBConnection().getCon();
	
	int k=0;
	
	public int insert(UserBean ub)
	{
		try {
			PreparedStatement ps =con.prepareStatement("INSERT INTO UserRegistration VALUES(?,?,?,?,?,?,?)");
			
			ps.setString(1, ub.getUserName());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getFirstName());
			ps.setString(4, ub.getLastName());
			ps.setString(5, ub.getAddress());
			ps.setString(6, ub.getMailId());
			ps.setString(7, ub.getPhNo());
			
			k=ps.executeUpdate();
			
		} 
		catch (Exception e) {e.printStackTrace();}
		
		return k;
	}
	
	
}
