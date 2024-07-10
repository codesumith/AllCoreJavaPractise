package com.sumith.typeScrollInsensitive_Oct10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBCon6 {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
			
			PreparedStatement ps=con.prepareStatement("select * from Customer56",1004,1007);
			
			ResultSet rs =ps.executeQuery();
			
			System.out.println("===Table data in reverse===");
			rs.afterLast();
			while(rs.previous())
			{
				System.out.println(rs.getString(1)+"\t"+
								   rs.getString(2)+"\t"+
								   rs.getString(3)+"\t"+
								   rs.getString(4)+"\t"+
								   rs.getLong(5));
						}
		}// end of try
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
