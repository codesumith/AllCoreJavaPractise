package com.sumith.jdbcrowset_catchedrowset;

import java.util.Scanner;
import javax.sql.rowset.*;

public class DBCon15 {

	public static void main(String[] args) {
		
		try(Scanner s =new Scanner(System.in);)
		{
			RowSetFactory rsf =RowSetProvider.newFactory();
			
			System.out.println("***CHOICE***");
			System.out.println("\t1.JdbcRowSet"
					+"\n\t2.CatchedRowSet");
			System.out.println("Enter the choice :");
			
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:
				JdbcRowSet jrs=rsf.createJdbcRowSet();
				jrs.setUrl("jdbc:mysql://localhost:3306/practise");
				jrs.setUsername("root");
				jrs.setPassword("Sumith@349");
				jrs.setCommand("SELECT * FROM Product56");
				
				jrs.execute();
				
				System.out.println("=====Product-data=====");
				while(jrs.next())
				{
					System.out.println(jrs.getString(1)+"\t"+
				jrs.getString(2)+"\t"+
							jrs.getDouble(3)+"\t"+
				jrs.getByte(4));
				}
				break;
				
			case 2:
				
				CachedRowSet crs=rsf.createCachedRowSet();
				crs.setUrl("jdbc:mysql://localhost:3306/practise");
				crs.setUsername("root");
				crs.setPassword("Sumith@349");
				crs.setCommand("Select * from Customer56");
				
				crs.execute();
				
				System.out.println("=====Customer-data=====");
				while(crs.next())
				{
					System.out.println(crs.getString(1)+"\t"+
							crs.getString(2)+"\t"+
							crs.getString(3)+"\t"+
							crs.getString(4)+"\t"+
							crs.getLong(5));
				}
				break;
				
				default :
					System.out.println("Invalid choice try again...");
				
			}
		}
catch(Exception e) {e.printStackTrace();}
	}

}
