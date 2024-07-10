package test;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class LoginDAO {

	UserBean ub =null;
	
	public UserBean log(HttpServletRequest req) {
		try {
		Connection con =new DBConnection().getcon();
		PreparedStatement ps =con.prepareStatement("Select * From UserNov22 Where UserName=? And Password = ?");
		ps.setString(1, req.getParameter("uname"));
		ps.setString(2, req.getParameter("pass"));
		
		ResultSet rs =ps.executeQuery();
		if(rs.next())
		{
			ub=new UserBean();
			ub.setUname(rs.getString(1));
			ub.setPass(rs.getString(2));
			ub.setFname(rs.getString(3));
			ub.setLname(rs.getString(4));
			ub.setAdd(rs.getString(5));
		}
		}catch(Exception e) {e.printStackTrace();}
		return ub;
		
		
	}

}
