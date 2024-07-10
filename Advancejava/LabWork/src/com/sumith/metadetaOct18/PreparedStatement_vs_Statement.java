package com.sumith.metadetaOct18;

import java.sql.*;

public class PreparedStatement_vs_Statement {

	public static void main(String[] args) {
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
		
		
		String [] names =new String[10000];
		for(int i=0;i<names.length;i++)
		{
			names[i]="name"+i;
		}
	//prepared Statement
		long startTime= System.currentTimeMillis();
		PreparedStatement ps =con.prepareStatement("Insert into Test values(?)");
		
		for(String name:names)
		{
			ps.setString(1, name);
			ps.addBatch();
		}
		ps.executeBatch();
		long endTime =System.currentTimeMillis();
		
		long preparedst =endTime-startTime;
		System.out.println("Prepared Statement :"+preparedst);
		
		         // Statement
				 startTime= System.currentTimeMillis();
				Statement stm =con.createStatement();
				
				for(String name:names)
				{
					stm.addBatch("Insert into Test values('"+name+"')");
				}
				stm.executeBatch();
				 endTime =System.currentTimeMillis();
				 
				 long statement =endTime-startTime;
				 System.out.println("Statement :"+statement);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
