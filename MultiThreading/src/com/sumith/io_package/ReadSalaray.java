package com.sumith.io_package;

import java.io.*;

public class ReadSalaray {

	public static void main(String[] args)  throws IOException
{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your Salary : ");
		String sal=br.readLine();
		
		double salary=Double.parseDouble(sal);
		
		System.out.println("Your Salary is :"+salary);
	}

}
