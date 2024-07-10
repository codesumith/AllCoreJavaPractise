package test;
import java.sql.*;

public class RegisterDAO {
	
	int k=0;
	public int register(UserBean ub)
	{
		try {
			Connection con= new DBConnection().getCon();
			PreparedStatement ps =con.prepareStatement("Insert into UserReg Values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getUserName());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getAddress());
			ps.setString(4, ub.getMailId());
			ps.setLong(5, ub.getPhnNO());
			ps.setString(6, ub.getState());
			ps.setString(7, ub.getCountry());
			
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
