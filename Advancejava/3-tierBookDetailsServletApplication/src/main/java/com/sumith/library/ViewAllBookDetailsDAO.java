package com.sumith.library;

import java.util.*;
import java.sql.*;

public class ViewAllBookDetailsDAO {

	public ArrayList<BookBean> al =new ArrayList<BookBean>();
	
	//method
	public ArrayList<BookBean> retrive()
	{
		try {
			Connection con =DBConnection.getCon(); //using connection
			
			PreparedStatement ps =con.prepareStatement("Select * from BookDetails56");
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next())
			{
				BookBean bb =new BookBean();//bean object
				
				bb.setCode(rs.getString(1));
				bb.setName(rs.getString(2));
				bb.setAuthor(rs.getString(3));
				bb.setPrice(rs.getDouble(4));
				bb.setQty(rs.getInt(5));
				
				al.add(bb);//adding bean to array list
			}// end of loop
			
		}catch(Exception e) {e.printStackTrace();}
		return al;
		
	}
}//end of class
