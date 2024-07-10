package com.sumith.bookdetails;
import java.sql.*;

public class AddBookDetailsDAO {

	public int k=0;
	public int insert(BookBean bb)
	{
		Connection con = new DBConnection().getCon();
		try {
			PreparedStatement ps =con.prepareStatement("INSERT INTO BookDetails56 VALUES(?,?,?,?,?)");
			ps.setString(1, bb.getBcode());
			ps.setString(2, bb.getBname());
			ps.setString(3, bb.getAuthor());
			ps.setFloat(4, bb.getPrice());
			ps.setInt(5, bb.getQty());
			
			k=ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		
		return k;
		
	}
	
}
