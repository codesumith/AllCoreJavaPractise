package com.sumith.userapp;

import java.sql.*;

public class UpdateProfileDAO {

	int k=0;
	public int updateProfile(UserBean ub)
	{
		Connection con=new DBConnection().getCon();
		try
		{
			PreparedStatement ps =con.prepareStatement("Update UserReg56 Set Address = ?,MailId = ?,Phone = ? where UserName = ?");
			ps.setString(1, ub.getAddress());
			ps.setString(2, ub.getMailId());
			ps.setString(3, ub.getPhone());
			ps.setString(4, ub.getUserName());
			
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		
		return k;
	}
	
}
