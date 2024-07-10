package com.sumith.io_package;

import java.io.*;

public class ReadChar {

	public static void main(String[] args) throws Exception{
		
var br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter you gender :");
int gender =br.read();

System.out.println("Your Gender is :"+gender);

	}

}
