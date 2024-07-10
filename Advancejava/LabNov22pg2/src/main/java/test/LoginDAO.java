package test;
import java.sql.*;

import javax.servlet.http.HttpServletRequest;

public class LoginDAO {

	String s=null;
	public String login(HttpServletRequest req)
	{
		try {
			Connection con =new DBConnection().getCon();
			PreparedStatement ps =con.prepareStatement("Select * from UserReg Where UserName=? AND PassWord =?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pass"));
			ResultSet rs =ps.executeQuery();
			if(rs.next()) {
				s=rs.getString(1);
			}
		}catch(Exception e) {e.printStackTrace();}
		return s;
		
	}
	
}
