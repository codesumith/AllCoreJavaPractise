package com.sumith.connectionpool;

import java.sql.*;
import java.util.*;

public class ConnectionPool {

	public String dbURL,uName,pWord;

	public ConnectionPool(String dbURL, String uName, String pWord) {
		super();
		this.dbURL = dbURL;
		this.uName = uName;
		this.pWord = pWord;
	}
	
	public Vector<Connection>v =new Vector<Connection>();
	
	public void generateConnections()
	{
		try
		{
			while(v.size()<5)
			{
				System.out.println("Pool is NotFull...");
				
				Connection con =DriverManager.getConnection(dbURL,uName,pWord);
				v.addElement(con);
				
				System.out.println(con);
			}//end of loop
			
			if(v.size()==5)
			{
				System.out.println("Pool is full...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//end of method
	
	public Connection useConnection()
	{
		Connection con = v.elementAt(0);
		v.removeElementAt(0);
		return con;
		
	}//end of method
	
	public void addBackConnection(Connection con)
	{
		v.addElement(con);
		System.out.println("Connection added back to pool...");
	}//end of method
}
