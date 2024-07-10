package com.sumith.properties;


import java.io.FileReader;
import java.util.Properties;

public class Ex1 {

	public static void main(String[] args) throws Exception {
		
		FileReader reader =new FileReader("/Users/sumith/Desktop/JavaIoFiles/connection.properties");
		
		Properties p= new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("User"));
		System.out.println(p.getProperty("Password"));
		System.out.println(p.getProperty("Driver"));

	}

}
