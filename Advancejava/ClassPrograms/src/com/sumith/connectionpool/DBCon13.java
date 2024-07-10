package com.sumith.connectionpool;

import java.io.FileReader;
import java.sql.*;
import java.util.*;

public class DBCon13 {

	public static void main(String[] args) throws Exception{
		
		FileReader reader=new FileReader("/Users/sumith/Desktop/JavaIoFiles/connection.properties");
		Properties p=new Properties();
		p.load(reader);
		
		
		ConnectionPool cp =new ConnectionPool(p.getProperty("Driver"), p.getProperty("User"), p.getProperty("Password"));

		cp.generateConnections();
		
		System.out.println("Pool Size :"+cp.v.size());
		System.out.println("*****User-1(Ram)*****");
		Connection con1 =cp.useConnection();
		System.out.println("Pool-Size :"+cp.v.size());
		System.out.println("---ProductDetails---");
		try
		{
			PreparedStatement ps1 =con1.prepareStatement("Select * from product56");
			ResultSet rs1 =ps1.executeQuery();
			while(rs1.next())
			{
				System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getDouble(3)+"\t"+rs1.getByte(4));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("*****User-2(Alex)*****");
		Connection con2=cp.useConnection();
		System.out.println(con2);
		System.out.println("Pool-Size"+cp.v.size());
		try
		{
			PreparedStatement ps2 =con2.prepareStatement("Select * from Bank56");
			ResultSet rs2= ps2.executeQuery();
			while(rs2.next())
			{
				System.out.println(rs2.getLong(1)+"\t"
									+rs2.getString(2)+"\t"
						            +rs2.getFloat(3)+"\t"
						            +rs2.getString(4));
			}//end of loop 
		}
		catch(Exception e) {e.printStackTrace();}
		
		System.out.println("****return by user-1(Ram)****");
		cp.addBackConnection(con1);
		System.out.println("Pool-size :"+cp.v.size());
		System.out.println("****return by user-2(Alex)****");
		cp.addBackConnection(con2);
		System.out.println("Pool-size:"+cp.v.size());
		
		System.out.println("***Display connections form pool***");
		
		Enumeration<Connection> e =cp.v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
