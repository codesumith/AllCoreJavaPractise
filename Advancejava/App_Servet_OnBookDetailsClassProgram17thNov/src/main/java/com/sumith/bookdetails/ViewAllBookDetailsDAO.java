package com.sumith.bookdetails;
import java.sql.*;
import java.util.*;
public class ViewAllBookDetailsDAO {

	public ArrayList<BookBean> al =new ArrayList<>();
	
	public ArrayList<BookBean> Retrieve()
	{
		
		try {
			Connection con = new DBConnection().getCon();
			PreparedStatement ps =con.prepareStatement("Select * from BookDetails56");
			ResultSet rs  = ps.executeQuery();
			
			while(rs.next())
			{
				BookBean bb =new BookBean();
				bb.setBcode(rs.getString(1));
				bb.setBname(rs.getString(2));
				bb.setAuthor(rs.getString(3));
				bb.setPrice(rs.getFloat(4));
				bb.setQty(rs.getInt(5));
				
				al.add(bb); //adding bean to array list
			}
		}catch(Exception e) {e.printStackTrace();}
		
		

		return al;
	}
	
}
