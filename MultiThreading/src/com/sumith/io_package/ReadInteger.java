package com.sumith.io_package;

import java.io.*;

public class ReadInteger {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your Age :");
		String ag=br.readLine();
		
		int age=Integer.parseInt(ag);
		
		if(age>=18)
		{
			System.out.println("Go for a movie");
		}
		else
		{
			System.out.println("Try after some year");
		}
		
		System.out.println("Your age is :"+ag);
	}
}
