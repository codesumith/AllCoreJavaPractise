package com.sumtith.TransactionManagement;

import java.sql.*;

import java.util.Scanner;

public class DBCon12 {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner (System.in);
		
		try(s)
		{
			try
			{
				  Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
					
					PreparedStatement ps1 = con.prepareStatement("Select * From Bank56 Where Accno=?");
					
					PreparedStatement ps2 = con.prepareStatement("Update Bank56 Set Bal=Bal+? Where Accno=?");
					
					System.out.println("AutoCommit:"+con.getAutoCommit());
					con.setAutoCommit(false);
					System.out.println("AutoCommit:"+con.getAutoCommit());

					Savepoint sp=con.setSavepoint();
					
					System.out.println("Enter Home Account No:");
					long hAccNo=Long.parseLong(s.nextLine());
					ps1.setLong(1, hAccNo);
					
					ResultSet rs1=ps1.executeQuery();
					
					if(rs1.next())
					{
						
						float bl=rs1.getFloat(3);
						
						System.out.println("Enter Benificiary Account No:");
						long bAccNo=Long.parseLong(s.nextLine());
						ps1.setLong(1, bAccNo);
						
						ResultSet rs2=ps1.executeQuery();
						
						if(rs2.next())
						{
							
							System.out.println("Enter amount to transfer");
							int amt=Integer.parseInt(s.nextLine());
							
							if(bl>amt)
							{
								ps2.setFloat(1, -amt);
								ps2.setLong(2, hAccNo);
								int p=ps2.executeUpdate();
							   //update in buffer
								
								ps2.setFloat(1, amt);
								ps2.setLong(2, bAccNo);
								int q=ps2.executeUpdate();
							   //update in buffer
								
								if(p==1&&q==1)
								{
									con.commit();//update in dataBase
									System.out.println("Transaction successfull...");
								}
								else {
									con.rollback(sp);
									System.out.println("Transaction failed..");
								}
								
								
							}//end of third if
							else {
								System.out.println("Insufficet funds..");
							}
							
							
						}//end of second if
						else {
							System.out.println("Invalid Benificiary Account number..");
						}
		

					}//end of first if
					else
					{
						System.out.println("Invalid Home Accno..");
					}
					
					
			}//end of try 
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}// end of try with resource
		
	}

}
