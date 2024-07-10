package test;

import java.sql.*;

public class UpdateDetailsDAO {

	public void update(UserBean ub) {
		
		Connection con =new DBConnection().getcon();
		try {
			PreparedStatement ps =con.prepareStatement("UPDATE UserNov22 SET Password =?,FirstName =?,LastName =?,Address=? WHERE UserName =?");
			ps.setString(1, ub.getPass());
			ps.setString(2, ub.getFname());
			ps.setString(3, ub.getLname());
			ps.setString(4, ub.getAdd());
			ps.setString(5, ub.getUname());
			
			ps.execute();
		}catch(Exception e) {e.printStackTrace();}
	}

}
