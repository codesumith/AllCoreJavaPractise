package com.sumith.bookdetails;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;

public class AdminLoginDAO {

	Connection con =new DBConnection().getCon();
	
	AdminBean ab =null;
	
	public AdminBean login(HttpServletRequest req)
	{
		
		try {
			PreparedStatement ps =con.prepareStatement("Select * from Admin56 Where UserName =? AND PassWord = ?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
		    
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				ab= new AdminBean();
				ab.setUname(rs.getString(1));
				ab.setPword(rs.getNString(2));
				ab.setFname(rs.getNString(3));
				ab.setLname(rs.getNString(4));
				ab.setAddress(rs.getNString(5));
				ab.setMid(rs.getNString(6));
				ab.setPhone(rs.getNString(7));
			}
		}catch(Exception e) {e.printStackTrace();}
		
		return ab;
	}
	
}
