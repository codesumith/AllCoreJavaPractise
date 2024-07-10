package com.sumith.io_package;

import java.io.*;

public class ReadNameFromKeyBoard {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream dis =new DataInputStream(System.in);
		
		System.out.print("Enter your name :");
		String name=dis.readLine();
		System.out.println("Your Name is :"+name);

	}

}
