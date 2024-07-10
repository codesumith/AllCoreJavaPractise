package com.sumith.io_package;

import java.io.*;

public class EmployeeData {

	public static void main(String[] args) throws IOException {
		
		var br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your Id :");
		int id=Integer.parseInt(br.readLine());
		
		System.out.print("Enter you Name :");
		String name=br.readLine();
		
		System.out.print("Enter your Gender :");
		char gender=(char) br.read();
		
		System.out.println("Your Id is:"+id);
		System.out.println("Your Name is :"+name);
		System.out.println("Your gender is :"+gender);
	}

}
