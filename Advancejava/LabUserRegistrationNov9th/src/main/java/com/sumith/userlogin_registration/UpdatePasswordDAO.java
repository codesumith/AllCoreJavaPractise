package com.sumith.userlogin_registration;
import java.sql.*;

public class UpdatePasswordDAO {
	
	Connection con=new DBConnection().getCon();
	
	int k=0;
	
	public int update(UserBean ub)
	{
		
		try {
			
			PreparedStatement ps =con.prepareStatement("UPDATE UserRegistration SET Password = ? WHERE Phone=?");
			
			ps.setString(1, ub.getPassword());
			ps.setString(2, ub.getPhNo());
			
		    k =ps.executeUpdate();
		} 
		catch (Exception e) {e.printStackTrace();}
		
		
		return k;
		
	}

}
