package com.sumith.userlogin_registration;
import java.sql.*;

public class LoginDAO {

	Connection con =new DBConnection().getCon();
	
	boolean check =false;
	
	public boolean checkCredentials(UserBean eb)
	{
		try {
			PreparedStatement ps =con.prepareStatement("SELECT * FROM UserRegistration WHERE UserName = ? AND Password = ?");
			
			ps.setString(1, eb.getUserName());
			ps.setString(2, eb.getPassword());
			
			ResultSet rs =ps.executeQuery();
			
			if(rs.next())
			{
				check=true;
			}
				
			
		} 
		catch (SQLException e) {e.printStackTrace();}
		
		return check;
	}
	
	
	
}
