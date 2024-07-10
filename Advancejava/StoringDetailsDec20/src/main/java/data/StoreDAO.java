package data;

import java.sql.*;
public class StoreDAO {
	
	int i;
	public int storeData(ObjectBean ob) {
		
		Connection con =new DBConnection().getCon();
		
		try{
		PreparedStatement ps = con.prepareStatement("Insert into Data VALUES(?,?,?,?)");
		ps.setString(1, ob.getFirstName());
		ps.setString(2, ob.getLastName());
		ps.setLong(3, ob.getPhn());
		ps.setString(4, ob.getMailId());
		
		i=ps.executeUpdate();
		}
		catch(Exception e ) {e.printStackTrace();}
		
		return i;
		
	}

}