package com.sumith.Oct13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductDetails_retr_rev__forw {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		try(s;)
		{
			try
			{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
		PreparedStatement ps1= con.prepareStatement("insert into Product56 values(?,?,?,?)");
		
		PreparedStatement ps2=con.prepareStatement("select * from Product56",1004,1007);
		
		
		
	
			System.out.println("***Choice***");
			System.out.println("\t1. Insert productDetails."
					+"\n\t2. Retrive productDetaisl in forward direction."
					+"\n\t3. Retrive productDetaisl in Reverse direction."
					+"\n\t4. Retrive 3rd Record from the top.");
			System.out.println("Enter your choice(1/2/3/4) :");
			
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:
				System.out.println("---ProductDetails---");
				System.out.println("Enter productId :");
				String cid=s.nextLine();
				
				System.out.println("Enter productName :");
				String cName=s.nextLine();
				
				System.out.println("Enter productPrice:");
				double price=Double.parseDouble(s.nextLine());
				
				System.out.println("Enter QTY:");
				int qty=s.nextInt();
				
				ps1.setString(1, cid);
				ps1.setString(2, cName);
				ps1.setDouble(3, price);
				ps1.setInt(4, qty);
				
				int k=ps1.executeUpdate();
				 
				if(k>0)
				{
					System.out.println("Product details inserted..");
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
				
				while(rs4.relative(3))
				{
					System.out.println(rs4.getString(1)+"\t"+
							rs4.getString(2)+"\t"+
							rs4.getDouble(3)+"\t"+
							rs4.getInt(4));
				}
				break;
				
				
				default :
					System.out.println("Invalid choice.."+"\n     Try Agian...");
			}
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource
		

	}

}
