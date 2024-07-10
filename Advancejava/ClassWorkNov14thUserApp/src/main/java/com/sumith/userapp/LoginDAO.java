package com.sumith.userapp;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;

public class LoginDAO {

	public UserBean ub=null;
	
	public UserBean login(HttpServletRequest req) 
	{
		
		Connection con =new DBConnection().getCon();
		try {
			PreparedStatement ps =con.prepareStatement("SELECT * FROM UserReg56 WHERE UserName = ? AND PWord = ?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			
			ResultSet rs =ps.executeQuery();
			
			if(rs.next())
			{
				ub=new UserBean();
				ub.setUserName(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setFirstName(rs.getString(3));
				ub.setLastName(rs.getString(4));
				ub.setAddress(rs.getString(5));
				ub.setMailId(rs.getString(6));
				ub.setPhone(rs.getString(7));
			}
		} catch (SQLException e) {e.printStackTrace();}
		
		return ub;
		
	}
	
	
}
