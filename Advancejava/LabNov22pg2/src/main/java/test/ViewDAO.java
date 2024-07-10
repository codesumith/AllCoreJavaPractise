package test;
import java.sql.*;
import java.util.*;

public class ViewDAO {

	ArrayList<UserBean> al=new ArrayList<>();
	
	public ArrayList<UserBean> viewAll()
	{
		try {
		Connection con =new DBConnection().getCon();
		PreparedStatement ps =con.prepareStatement("Select * From UserReg");
		ResultSet rs =ps.executeQuery();
		while(rs.next())
				{
			UserBean ub =new UserBean();
			ub.setUserName(rs.getString(1));
			ub.setPassword(rs.getString(2));
			ub.setAddress(rs.getString(3));
			ub.setMailId(rs.getString(4));
			ub.setPhnNO(Long.parseLong(rs.getString(5)));
			ub.setState(rs.getString(6));
			ub.setCountry(rs.getString(7));
			al.add(ub);
				}
		}catch(Exception e) {e.printStackTrace();}
		
		
		return al;
		
	}
	
}
