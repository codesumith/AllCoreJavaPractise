package com.sumith.userlogin_registration;
import java.sql.*;

public class DeleteUserDAO {

	Connection con =new DBConnection().getCon();
	
	int k=0;
	
	public int deleteAccount(UserBean ub)
	{
		
		try {
			PreparedStatement ps =con.prepareStatement("Delete From UserRegistration WHERE Phone=?");
			
			ps.setString(1, ub.getPhNo());
			
			  k =ps.executeUpdate();
			
		} catch (Exception e) {e.printStackTrace();}
		
		return k;
		
	}
	
}
