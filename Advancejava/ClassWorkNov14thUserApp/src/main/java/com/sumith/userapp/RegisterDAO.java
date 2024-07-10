package com.sumith.userapp;
import java.sql.*;

public class RegisterDAO {

    public  int k=0;
	public int register(UserBean ub)
	{
		
		Connection con =new DBConnection().getCon();
		try {
		PreparedStatement ps =con.prepareStatement("INSERT INTO UserReg56 VALUES(?,?,?,?,?,?,?)");
		System.out.println(ub.getUserName());
		ps.setString(1, ub.getUserName());
		ps.setString(2, ub.getPassword());
		ps.setString(3, ub.getFirstName());
		ps.setString(4, ub.getLastName());
		ps.setString(5, ub.getAddress());
		ps.setString(6, ub.getMailId());
		ps.setString(7, ub.getPhone());
		
	      k=ps.executeUpdate();
		
		}catch(Exception e) {e.printStackTrace();}
		
		return k;
		
	}
	
}
