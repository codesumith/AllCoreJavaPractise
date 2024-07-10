package com.sumith.insert_retive_studetails_marks_with_procedures_oct14;

import java.util.*;
import java.sql.*;

public class Inserting_StudentDetails {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try(s)
		{
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
				System.out.println("Enter Roll No :");
				int rn=Integer.parseInt(s.nextLine());
				
				System.out.println("Enter Student Name :");
				String sn=s.nextLine();
				
				System.out.println("Enter Branch :");
				String br=s.nextLine();
				
				System.out.println("Enter City :");
				String cty=s.nextLine();
				
				System.out.println("Enter State :");
				String st=s.nextLine();
				
				System.out.println("Enter Pincode :");
				int pin=Integer.parseInt(s.nextLine());
				
				System.out.println("Enter Mail-ID :");
				String mid=s.nextLine();
				
				System.out.println("Enter PhnNo :");
				long phn=Long.parseLong(s.nextLine());
				
				System.out.println("Enter Subject 1 Marks");
				byte s1=Byte.parseByte(s.nextLine());
				
				System.out.println("Enter Subject 2 Marks");
				byte s2=Byte.parseByte(s.nextLine());
				
				System.out.println("Enter Subject 3 Marks");
				byte s3=Byte.parseByte(s.nextLine());
				
				System.out.println("Enter Subject 4 Marks");
				byte s4=Byte.parseByte(s.nextLine());
				
				System.out.println("Enter Subject 5 Marks");
				byte s5=Byte.parseByte(s.nextLine());
				
				System.out.println("Enter Subject 6 Marks");
				byte s6=Byte.parseByte(s.nextLine());
				
				byte[]b= {s1,s2,s3,s4,s5,s6};
				String rs="";
				
				for(int i=0;i<b.length;i++)
				{
					if(b[i]<0||b[i]>100)
					{
						System.out.println("Enter Marks between (0-100) only");
						System.out.println("Try Again...");
						System.exit(0);
					}
					else if(b[i]<35)
					{
						rs="Fail";
					}
				}
				
				short tm=(short) (s1+s2+s3+s4+s5+s6);
				float pr=(((float)tm/600)*100);
				
				
			if(rs!="Fail")
			{
				if(pr<=100&&pr>=70)
				{
					rs="Distinction";
				}
		   else if(pr<70&&pr>=60)
				{
					rs="FirstClass";
				}
		   else if(pr<60&&pr>=50)
			{
				rs="SecondClass";
			}
		   else if(pr<50&&pr>=35)
			{
				rs="ThirdClass";
			}
		   else
		   {
			   rs="Fail";   
		   }
			} //end of if
			
			
			CallableStatement cs= con.prepareCall("{CALL InsertStuDetails56(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
				
			cs.setInt(1, rn);
			cs.setString(2, sn);
			cs.setString(3, br);
			cs.setString(4, cty);
			cs.setString(5, st);
			cs.setInt(6, pin);
			cs.setString(7, mid);
			cs.setLong(8,phn);
			cs.setByte(9, s1);
			cs.setByte(10, s2);
			cs.setByte(11, s3);
			cs.setByte(12, s4);
			cs.setByte(13, s5);
			cs.setByte(14, s6);
			cs.setShort(15, tm);
			cs.setFloat(16, pr);
			cs.setString(17, rs);
			
			cs.execute();
			
			System.out.println("Details stored successfully..");
			
			
			
			
			}// end of try 
			catch(Exception e) {e.printStackTrace();}
			
		}//end of try with resource

	}

}
