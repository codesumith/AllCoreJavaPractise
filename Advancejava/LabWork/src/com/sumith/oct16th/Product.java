package com.sumith.oct16th;

import java.util.*;
import java.sql.*;

public class Product {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s)
		{
			
			try
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/labwork","root","Sumith@349");
				
				
				PreparedStatement ps1 =con.prepareStatement("INSERT INTO Product VALUES(?,?,?,?)");
				
				PreparedStatement ps2 =con.prepareStatement("SELECT * FROM Product",1004,1007);
				
				while(true)
				{
				System.out.println("***CHOICE***");
				System.out.println("\t  1.Insert productdetails into product table.\n"
						+ "          2.Retrieve productdetails in forward direction.\n"
						+ "          3.Retrieve productdetails in reverse direction.\n"
						+ "          4.Retrieve 3rd record from top.\n"
						+ "          5.Retrieve 3rd record from bottom.\n "
						+ "         6.Exit");
				System.out.println("Enter your choice :");
				switch(Integer.parseInt(s.nextLine()))
				{
				case 1:
					System.out.println("---ProductDetails---\n");
					
					System.out.println("Enter ID :");
					String id =s.nextLine();
					
					System.out.println("Enter ProductName :");
					String nm =s.nextLine();
					
					System.out.println("Enter Price :");
					float pr =Float.parseFloat(s.nextLine());
					
					System.out.println("Enter Quantity :");
					int qty =Integer.parseInt(s.nextLine());
					
					ps1.setString(1,id);
					ps1.setString(2,nm);
					ps1.setFloat(3,pr);
					ps1.setInt(4,qty);
					
					int k =ps1.executeUpdate();
					
					if(k>0) System.out.println("Product Details Inserted Successfully");
					
					break;
					
				case 2:
					System.out.println("---ProductDetails---\n");
					
					ResultSet rs2 = ps2.executeQuery();
					while(rs2.next())
					{
					System.out.println(rs2.getString(1)+"\t"+
									   rs2.getString(2)+"\t"+
									   rs2.getFloat(3)+"\t"+
									   rs2.getInt(4));
					}
					break;
					
				case 3:
					
					ResultSet rs3 = ps2.executeQuery();
					rs3.afterLast();
					while(rs3.previous())
					{
					System.out.println(rs3.getString(1)+"\t"+
									   rs3.getString(2)+"\t"+
									   rs3.getFloat(3)+"\t"+
									   rs3.getInt(4));
					}
					break;
					
				case 4:

					ResultSet rs4 = ps2.executeQuery();
					int i=0;
					while(rs4.next())
					{
						i++;
						if(i==3) {
					System.out.println(rs4.getString(1)+"\t"+
									   rs4.getString(2)+"\t"+
									   rs4.getFloat(3)+"\t"+
									   rs4.getInt(4));
						}
					}
					
					break;
					
				case 5:
					ResultSet rs5 = ps2.executeQuery();
					rs5.afterLast();
					int j=0;
					while(rs5.previous())
					{
						j++;
						if(j==3) {
					System.out.println(rs5.getString(1)+"\t"+
									   rs5.getString(2)+"\t"+
									   rs5.getFloat(3)+"\t"+
									   rs5.getInt(4));
						}
					}
					break;
					
				case 6:
					System.out.println("Operation Ended...");
					System.exit(0);
					break;
					
					default :
					System.out.println("Invalid Choice..  Try again.." );
				}
				}//end of loop	
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}//end of try with resource

	}

}
