package com.sumith.DBCon3;
import java.util.*;
import java.sql.*;

public class DBCon3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s;)
		{
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root","Sumith@349");
						
//				PreparedStatement ps= con.prepareStatement("CREATE TABLE Product56("
//															+"code varchar(10),"
//															+"name varchar(10),"
//															+"price double(10,2),"
//															+"qty   smallint)");
//				
//				ps.executeUpdate();
				
				PreparedStatement ps1 =con.prepareStatement("insert into Product56 values(?,?,?,?)");
				
				PreparedStatement ps2 =con.prepareStatement("select * from Product56");

				PreparedStatement ps3 =con.prepareStatement("select * from Product56 where code=?");
				
				PreparedStatement ps4 =con.prepareStatement("update Product56 set price=?,qty=qty+? where code=?");
				
				PreparedStatement ps5 =con.prepareStatement("Delete from Product56 where code=?");
				
				while(true)
				{
					System.out.println("***Choice***");
					System.out.println("\t1.AddProduct"
									  +"\n\t2.ViewAllProducts"
							          +"\n\t3.ViewProductByCode"
									  +"\n\t4.UpdateProduct(price,qty)"
							          +"\n\t5.DeleteProduct"
									  +"\n\t6.Exit");
					
					System.out.println("Select your choice :");
					
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						System.out.println("---ProductDetails---");
						
						System.out.println("Enter ProductCode :");
						String pc1=s.nextLine();
						
						System.out.println("Enter ProductName :");
						String pName=s.nextLine();
						
						System.out.println("Enter ProductPrice :");
						double price=Double.parseDouble(s.nextLine());
						
						System.out.println("Enter qty:");
						int qty=Integer.parseInt(s.nextLine());
						
						//Loading object values 
						
						//Using setters 
						ps1.setString(1, pc1);
						ps1.setString(2, pName);
						ps1.setDouble(3, price);
						ps1.setInt(4, qty);
						
						int k=ps1.executeUpdate();
						
						if(k>0) {System.out.println("Product Added Succesfully...");}
						

					break;
					
					case 2:
						
						System.out.println("===Product Details===");
						
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
						
						System.out.println("Enter product code :");
						String pc2=s.nextLine();
						
					    ps3.setString(1, pc2);
						
					    ResultSet rs2=ps3.executeQuery();
					    
					  
					   
					   if(rs2.next())
					   {
						   System.out.println(rs2.getString(1)+"\t"+
								   rs2.getString(2)+"\t"+
						           rs2.getDouble(3)+"\t"+
								   rs2.getInt(4)); 
					   }
					   else
					   {
						   System.out.println("Product Invalid...");
					   }
						
						break;
						
					case 4:
						System.out.println("---ProductDetails---");
						System.out.println("Enter productcode :");
						String pc4=s.nextLine();
						
						ps3.setString(1, pc4);
						
						ResultSet rs3=ps3.executeQuery();
						
						if(rs3.next())
						{
							System.out.println("Old Price:"+rs3.getDouble(3));
							System.out.println("Enter new Price");
							double nprice=Double.parseDouble(s.nextLine());
							
							System.out.println("Existing quantity :"+rs3.getInt(4));
							System.out.println("Enter new quantity(New Stock) :");
							int quantity=Integer.parseInt(s.nextLine());
							
							ps4.setDouble(1, nprice);
							ps4.setInt(2, quantity);
							ps4.setString(3, pc4);
							
							int up=ps4.executeUpdate();
							
							if(up>0)
							{
								System.out.println("Product Updated...");
							}
							else {
								System.out.println("Invalid Product...");
							}
						}
						break;
						
					case 5:
						System.out.println("Enter Product code:");
						String pc5=s.nextLine();
						
						ps3.setString(1, pc5);
						
						ResultSet rs5=ps3.executeQuery();
						
						if(rs5.next())
						{
							ps5.setString(1, pc5);
							
							int up5=ps5.executeUpdate();
							
							if(up5>0)
							{
								System.out.println("Product deleted...");
							}
							else
							{
								System.out.println("Invalid productCode...");
							}
						}
						break;
						
					case 6:
						System.out.println("Operation stopped...");
						con.close();
						System.exit(0);
						
						default :
							System.out.println("Invalid choice...");
					}//end of switch
					
				}//end of while loop

			   }//end of try
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
				
		}// end of try with resource		
				
	}

}
