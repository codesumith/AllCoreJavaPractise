package com.sumith.typeScrollInsensitive_Oct10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCon5 {

	public static void main(String[] args) {
	
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
		Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs=stm.executeQuery("select * from Product56");
		
		System.out.println("===ProductDetails===");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+
							   rs.getString(2)+"\t"+
							   rs.getDouble(3)+"\t"+
							   rs.getInt(4));
		}
		
		System.out.println("===Table data in reverse===");
		
		while(rs.previous())
		{
			System.out.println(rs.getString(1)+"\t"+
					   rs.getString(2)+"\t"+
					   rs.getDouble(3)+"\t"+
					   rs.getInt(4));
		}
		
System.out.println("===First Row===");
		
		rs.first();
		
		System.out.println(rs.getString(1)+"\t"+
				   rs.getString(2)+"\t"+
				   rs.getDouble(3)+"\t"+
				   rs.getInt(4));
		
		System.out.println("===Last Row===");
		
		rs.last();
		
		System.out.println(rs.getString(1)+"\t"+
				   rs.getString(2)+"\t"+
				   rs.getDouble(3)+"\t"+
				   rs.getInt(4));
		
		System.out.println("===Row-3===");
		
		rs.absolute(3);
		
		System.out.println(rs.getString(1)+"\t"+
				   rs.getString(2)+"\t"+
				   rs.getDouble(3)+"\t"+
				   rs.getInt(4));
		
		System.out.println("===Relative(-1)===");
		
		rs.relative(-1);
		
		System.out.println(rs.getString(1)+"\t"+
				   rs.getString(2)+"\t"+
				   rs.getDouble(3)+"\t"+
				   rs.getInt(4));
		
		
		}//end of try
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
