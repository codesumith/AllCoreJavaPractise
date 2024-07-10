package com.sumith.Test_Oct14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

try(s;)
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
		PreparedStatement ps1= con.prepareStatement("Insert into Product56 values(?,?,?,?)");
		
		PreparedStatement ps2= con.prepareStatement("Select * from Product56",1004,1007);
		
		while(true)
		{
			System.out.println("***Choice***");
		    System.out.println("\t1.Insert productdetails into product table.\n"
					+ "          2.Retrieve productdetails in forward direction.\n"
					+ "          3.Retrieve productdetails in reverse direction.\n"
					+ "          4.Retrieve 3rd record from top.\n"
					+ "          5.Retrieve 3rd record from bottom.\n"
					+ "          6.Exit.");
			System.out.println("Select your choice :");
			
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:
				System.out.println("--ProductDetails--");
				
				System.out.println("Enter productCode:");
				String pId=s.nextLine();
				
				System.out.println("Enter productName:");
				String pName=s.nextLine();
				
				System.out.println("Enter productPrice:");
				double Price=Double.parseDouble(s.nextLine());
				
				System.out.println("Enter productQty:");
				int qty=Integer.parseInt(s.nextLine());
				
				ps1.setString(1, pId);
				ps1.setString(2, pName);
				ps1.setDouble(3, Price);
				ps1.setInt(4, qty);
				
				int k=ps1.executeUpdate();
				
				if(k>0)
				{
					System.out.println("Product details Inserted Successfully..");
				}
				
				break;
			case 2:
				ResultSet rs=ps2.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getString(1)+"\t"+
							rs.getString(2)+"\t"+
							rs.getDouble(3)+"\t"+
							rs.getInt(4));
				}
				
				break;
			case 3:
				ResultSet rs1=ps2.executeQuery();
				
				rs1.afterLast();
				
				while(rs1.previous())
				{
					System.out.println(rs1.getString(1)+"\t"+
							rs1.getString(2)+"\t"+
							rs1.getDouble(3)+"\t"+
							rs1.getInt(4));
				}
				break;
			case 4:
				
				ResultSet rs4=ps2.executeQuery();
				int i=0;
				while(rs4.next())
				{
					i++;
					if(i==3) {
					System.out.println(rs4.getString(1)+"\t"+
							rs4.getString(2)+"\t"+
							rs4.getDouble(3)+"\t"+
							rs4.getInt(4));
					}
					
				}
				
			
				
				break;
			case 5:
				
ResultSet rs5=ps2.executeQuery();
				
				rs5.last();
				
				int z=0;
				while(rs5.previous())
				{
					z++;
					if(z==3) {
					System.out.println(rs5.getString(1)+"\t"+
							rs5.getString(2)+"\t"+
							rs5.getDouble(3)+"\t"+
							rs5.getInt(4));
					}
				}
				break;
			case 6:
				System.out.println("Operation Stopped ..");
				System.exit(0);
				break;
				default:
					System.out.println("Invalid Choice try again.");
			}
		}
	}//end of try
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}//end of try with resource

	}

}
