package com.sumith.labwork17Oct;

import java.sql.*;

public class ProvesPreparedStatementIsFasterThanStatement {

	public static void main(String[] args) {
		
		try
		{
			// it will load or register the mysql jdbc Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
		
		int numRecords=10000;
		String [] names= new String[numRecords];
		for(int i=0;i<names.length;i++)
		{
			names[i]="Name"+i;
		}
		
		//Execute batch insert using PreparedStatement
		long startTime=System.currentTimeMillis();
		PreparedStatement ps=con.prepareStatement("Insert into test values(?)");
		
		for(String name:names)
		{
			ps.setString(1, name);
			ps.addBatch();
		}
		ps.executeBatch();
		long endTime=System.currentTimeMillis();
		
		long preparedStatementTime=endTime-startTime;
		
		System.out.println("PreparedStatement :"+preparedStatementTime);
		
		//Execute batch insert using Statement
				 startTime=System.currentTimeMillis();
				Statement s=con.createStatement();
				
				for(String name:names)
				{

					s.addBatch("INSERT INTO Test Values('"+name+"')");
				
					
				}
				s.executeBatch();
				 endTime=System.currentTimeMillis();
				long  StatementTime=endTime-startTime;
				
				System.out.println("Statement :"+StatementTime);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
