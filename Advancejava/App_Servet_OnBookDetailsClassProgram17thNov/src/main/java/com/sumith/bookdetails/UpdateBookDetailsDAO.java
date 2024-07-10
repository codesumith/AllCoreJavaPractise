package com.sumith.bookdetails;
import java.sql.*;

public class UpdateBookDetailsDAO {

	public int k =0;
	public int update(BookBean bb)
	{
		
		try
		{
			Connection con = new DBConnection().getCon();
			PreparedStatement ps =con.prepareStatement("Update BookDetails56 set Price =?,QTY =QTY+? where Code =?");
			ps.setFloat(1, bb.getPrice());
			ps.setInt(2, bb.getQty());
			ps.setString(3, bb.getBcode());
			 k=ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		return k;
		
	}
	
}
