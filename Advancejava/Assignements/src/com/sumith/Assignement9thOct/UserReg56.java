package com.sumith.Assignement9thOct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserReg56 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s;)
		{
			
			try
			{
			
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
//				PreparedStatement ps=con.prepareStatement("create table UserReg56("
//														 +"uname varchar(15),"
//														 +"pword varchar(15),"
//														 +"fname varchar(15),"
//														 +"lname varchar(15),"
//														 +"city  varchar(10),"
//														 +"mid   varchar(15),"
//														 +"phno  bigint(12),"
//														 +"primary key (uname))");
//				ps.executeUpdate();
				
				PreparedStatement ps1 = con.prepareStatement("insert into UserReg56 values(?,?,?,?,?,?,?)");
				
				PreparedStatement ps2 = con.prepareStatement("select * from UserReg56 where uname=? and pword=?");
				
				PreparedStatement ps3 = con.prepareStatement("select * from UserReg56 where uname=?");
				
				PreparedStatement ps4 = con.prepareStatement("update UserReg56 set city=?,mid=?,phno=? where uname=?");
				
				while(true)
				{
					System.out.println("***Choice***");
					System.out.println("\t1.Register."
							          +"\n\t2.Login.");
					
					System.out.println("Enter your choice :");
					
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						System.out.println("---Register your details---");
						
						System.out.println("Enter UserName:");
						String uName=s.nextLine();
						
						System.out.println("Enter Password:");
						String pWord=s.nextLine();
						
						System.out.println("Enter FirstName:");
						String fName=s.nextLine();
						
						System.out.println("Enter LastName:");
						String lName=s.nextLine();
						
						System.out.println("Enter Your CityName:");
						String cName=s.nextLine();
						
						System.out.println("Enter Your MailId:");
						String mailID=s.nextLine();
						
						System.out.println("Enter Your PhnNo:");
						long phnNo=Long.parseLong(s.nextLine());
						
						ps1.setString(1, uName);
						ps1.setString(2, pWord);
						ps1.setString(3, fName);
						ps1.setString(4, lName);
						ps1.setString(5, cName);
						ps1.setString(6, mailID);
						ps1.setLong(7, phnNo);
						
						int k=ps1.executeUpdate();
						
						if(k>0)
						{
							System.out.println("Registration process Successfull...");
						}

						
						
						break;
						
					case 2:
						System.out.println("---LoginDetails---");
						
						System.out.println("Enter User Name:");
						String uname=s.nextLine();
						
						System.out.println("Enter Password:");
						String pword=s.nextLine();
						
						ps2.setString(1,uname);
						ps2.setString(2, pword);
						
						ResultSet rs=ps2.executeQuery();
						
						if(rs.next())
						{
						
						while(true)
						{
							System.out.println("***CHOICE***");
							System.out.println("\t1.ViewDetails."
									          +"\n\t2.Update."
									          +"\n\t3.Exit.");
							
							System.out.println("Enter Your Choice :");
							
							switch(Integer.parseInt(s.nextLine()))
							{
							case 1:
								System.out.println("---BIO---");
								ps3.setString(1, uname);
								ResultSet rs1=ps3.executeQuery();
								while(rs1.next()) {
								System.out.println(rs1.getString(1)+"\t"+
												   rs1.getString(2)+"\t"+
												   rs1.getString(3)+"\t"+
												   rs1.getString(4)+"\t"+
												   rs1.getString(5)+"\t"+
												   rs1.getString(6)+"\t"+
												   rs1.getLong(7));
								}
								break;
								
							case 2:
								System.out.println("---Update---");
								
								ps3.setString(1, uname);
								
								ResultSet rs2=ps3.executeQuery();
								
								while(rs2.next()) {
								System.out.println("Old Address:"+rs2.getString(5));
								System.out.println("Enter New Address:");
								String city=s.nextLine();
								
								System.out.println("Old MailID:"+rs2.getString(6));
								System.out.println("Enter New MailID:");
								String MailID=s.nextLine();
								
								System.out.println("Old PhnNo:"+rs2.getLong(7));
								System.out.println("Enter New PhnNo");
								long PhnNo=Long.parseLong(s.nextLine());
								
								ps4.setString(1, city);
								ps4.setString(2, MailID);
								ps4.setLong(3, PhnNo);
								ps4.setString(4, uname);
								
							
                                int k2=ps4.executeUpdate();
								
								if(k2>0)
								{
									System.out.println("Details Updated Successfully...");
								}
								}
								
								break;
								
							case 3:
								System.out.println("Operation stopped...");
								System.exit(0);
								break;
								
							default :
								System.out.println("Invalid Choice...");
							}
						}//end of loop
						
					}
						else
						{
							System.err.println("Invalid UserName (or) PassWord...");
						}
						break;
						
						default :
							System.out.println("Invalid Choice...");
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
