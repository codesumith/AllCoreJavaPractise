package com.sumith.library;
import java.sql.*;

public class AddBookDetailsDAO {

	public int k=0;
	
	
	public int insert(BookBean bb)
	{
		Connection con = DBConnection.getCon();
		try {
			PreparedStatement ps =con.prepareStatement("INSERT INTO BookDetails56 VALUES(?,?,?,?,?)");
			
			ps.setString(1, bb.getCode());
			ps.setString(2, bb.getName());
			ps.setString(3, bb.getAuthor());
			ps.setDouble(4, bb.getPrice());
			ps.setInt(5, bb.getQty());
			
			 k=ps.executeUpdate();
		} catch (Exception e) {e.printStackTrace();}
		return k;
	}
	
}
