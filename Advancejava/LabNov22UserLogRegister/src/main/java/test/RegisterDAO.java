package test;
import java.sql.*;

public class RegisterDAO {

	int k =0;
	public int register(UserBean ub) {
		try {
			Connection con =new DBConnection().getcon();
			PreparedStatement ps =con.prepareStatement("INSERT INTO UserNov22 VALUES(?,?,?,?,?)");
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPass());
			ps.setString(3, ub.getFname());
			ps.setString(4, ub.getLname());
			ps.setString(5, ub.getAdd());
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
