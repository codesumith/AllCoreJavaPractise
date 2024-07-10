package com.sumith.bachprocessing_using_statement_and_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBCon7 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		try(s;){
			
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
		
		Statement stm=con.createStatement();
		
	System.out.println("Enter the prodCode(Available):");
	String pc=s.nextLine();
		
		
		stm.addBatch("delete from Product56 where code='"+pc+"'");
		
		System.out.println("---CustomerDetails---");
		
		System.out.println("Enter the custID :");
		String cID=s.nextLine();
		
		System.out.println("Enter the custName:");
		String cName=s.nextLine();
		
		System.out.println("Enter the Address :");
		String city=s.nextLine();
		
		System.out.println("Enter the MailID :");
		String mailID=s.nextLine();
		
		System.out.println("Enter the PhnNo :");
		String phnNo=s.nextLine();
		
		stm.addBatch("insert into Customer56 values('"+cID+"','"+cName+"','"+city+"','"+mailID+"',"+phnNo+")");
		
		int k[]=stm.executeBatch();
		
		for(int i=1;i<k.length;i++)
		{
			System.out.println(i+". Excecuted Succesfully");
		}
		
		stm.clearBatch();
		con.close();
		}//end of try
		
		catch(Exception e ) {e.printStackTrace();}
		
		}// end of try with resource
	}

}
