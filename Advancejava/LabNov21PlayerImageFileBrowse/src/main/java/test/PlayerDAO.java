package test;
import java.sql.*;

public class PlayerDAO {

	int k =0;
	
	public int insert(PlayerBean pb)
	{
		
		try {
			Connection con =new DBConnection().getcon();
			PreparedStatement ps =con.prepareStatement("INSERT INTO PlayerInfo VALUES(?,?,?)");
			ps.setString(1, pb.getId());
			ps.setString(2, pb.getName());
			ps.setBytes(3, pb.getB());
			k=ps.executeUpdate();
			
		System.out.println(pb.getB());
		}catch(Exception e) {e.printStackTrace();}
		
		return k;
		
	}

}
