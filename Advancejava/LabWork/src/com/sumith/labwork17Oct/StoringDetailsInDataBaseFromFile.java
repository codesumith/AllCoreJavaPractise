package com.sumith.labwork17Oct;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StoringDetailsInDataBaseFromFile {
	
	public static void main(String[] args) {
		

		
		
		
		
			try
			{
            Class.forName("com.mysql.cj.jdbc.Driver");
				
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
			
		    PreparedStatement ps= con.prepareStatement("INSERT INTO Mock_Data Values(?,?,?,?,?,?)");
		
		    FileInputStream fis =new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/MOCK_DATA.csv");
		    
		    Scanner s= new Scanner(fis);
		    s.nextLine();
		    
		    int e=1;
		    while(s.hasNext())
		    {
		    	String str []=s.nextLine().split(",");
		    	
		    	for(int i=1;i<=6;i++)
		    	{
		    		ps.setString(i, str[i-1]);
		    	}
		    	
		    	int k=ps.executeUpdate();
		    	
		    	if(k>0)
		    	{
		    		System.out.println(e+"  Row Updated Succesfully..");
		    		e++;
		    	}
		    }
		    s.close();
		    con.close();

			
			}//end of try 
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		
		
	}

}
