package com.sumith.BookDetails56as2;

import java.util.*;
import java.sql.*;

public class BookDetails56 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s;)
		{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
			
//			PreparedStatement ps=con.prepareStatement("CREATE TABLE BookDetails56("
//					                                 +"code varchar(10),"
//					                                 +"name varchar(20),"
//					                                 +"author varchar(15),"
//			                 						 +"price double(10,2),"
//					                                 +"qty smallint)"
//													 );
//			ps.executeUpdate();
			
			PreparedStatement ps1=con.prepareStatement("insert into BookDetails56 values(?,?,?,?,?)");
			
			PreparedStatement ps2=con.prepareStatement("select * from BookDetails56");

			PreparedStatement ps3=con.prepareStatement("select * from BookDetails56 where code=?");
			
			PreparedStatement ps4=con.prepareStatement("update BookDetails56 set price=?,qty=qty+? where code=?");
			
			PreparedStatement ps5=con.prepareStatement("delete from BookDetails56 where code=?");
			
			
			while(true)
			{
				System.out.println("***CHOICE***");
				System.out.println("\t1.AddBookDetails"
						          +"\n\t2.ViewAllBookDetails"
								  +"\n\t3.ViewBookDetailsByCode"
						          +"\n\t4.UpdateBookDetails(Price,Qty)"
								  +"\n\t5.DeleteBookDetails"
						          +"\n\t6.Exit");
				
				System.out.println("Enter Your choice :");
				
				switch(Integer.parseInt(s.nextLine()))
				{
				case 1:
					System.out.println("---BookDetails---");
					
					System.out.println("Enter BookCode :");
					String bc=s.nextLine();
					
					System.out.println("Enter BookName :");
					String bName=s.nextLine();
					
					System.out.println("Enter BookAuthorName :");
					String author=s.nextLine();
					
					System.out.println("Enter BookPrice :");
					double price=Double.parseDouble(s.nextLine());
					
					System.out.println("Enter Quantity:");
					int qty =Integer.parseInt(s.nextLine());
					
					//Loading data to prepared statement
					
					//using setter methods
					ps1.setString(1, bc);
					ps1.setString(2, bName);
					ps1.setString(3, author);
					ps1.setDouble(4, price);
					ps1.setInt(5,qty);
					
					int k=ps1.executeUpdate();
					
					if(k>0)
					{
						System.out.println("Book added succesfully...");
					}

					break;
					
				case 2:
					System.out.println("===BooksDetails===");
					
					ResultSet rs=ps2.executeQuery();
					
					while(rs.next())
					{
						System.out.println(rs.getString(1)+"\t"+
					                       rs.getString(2)+"\t"+
										   rs.getString(3)+"\t"+
					                       rs.getDouble(4)+"\t"+
										   rs.getInt(5));
					}
					break;
					
				case 3:
					System.out.println("@@@BookDetailsByCode@@@");
					System.out.println("--------------------------");
					System.out.println("Enter Book code :");
					String bc1=s.nextLine();
					
					ps3.setString(1, bc1);
					
					ResultSet rs1=ps3.executeQuery();
					
					if(rs1.next())
					{
						System.out.println(rs1.getString(1)+"\t"+
			                       rs1.getString(2)+"\t"+
								   rs1.getString(3)+"\t"+
								   rs1.getDouble(4)+"\t"+
			                       rs1.getInt(5));
					}
					else
					{
						System.out.println("Invalid BookCode...");
					}
				
					break;
					
				case 4:
					System.out.println("---ProductDetails---");
					System.out.println("Enter BookCode :");
					String bc4=s.nextLine();
					
					ps3.setString(1, bc4);
					ResultSet rs3=ps3.executeQuery();
					
					if(rs3.next())
					{
						System.out.println("Old price :"+rs3.getDouble(4));
						System.out.println("Enter new Price:");
						double nPrice=Double.parseDouble(s.nextLine());
						
						System.out.println("Old Quantity :"+rs3.getInt(5));
						System.out.println("Enter New Quantity(New Stock):");
						int quantity=Integer.parseInt(s.nextLine());
						
						ps4.setDouble(1, nPrice);
						ps4.setInt(2, quantity);
						ps4.setString(3, bc4);
						
						int c5=ps4.executeUpdate();
						
						if(c5>0)
						{
							System.out.println("Book Details updated...");
						}
						else
						{
							System.out.println("Invalid Code...");
						}
					}
					break;
					
				case 5:
					System.out.println("Enter book code:");
					String bc5=s.nextLine();
					
					ps3.setString(1, bc5);
					
					ResultSet rs5=ps3.executeQuery();
					
					if(rs5.next())
					{
						ps5.setString(1, bc5);
						int up5=ps5.executeUpdate();
						
						if(up5>0) {
						System.out.println("Book Details Deleted...");
						}
						else
						{
							System.out.println("Inavalid Code");
						}
					}
					//System.out.println("Enter ");
					break;
					
				case 6:
					System.out.println("Operation stopped...");
					con.close();
					System.exit(0);
					
				default :
					System.out.println("Invalid choice...");
				}// end of switch
				
			}//end of loop

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}

	}

}
