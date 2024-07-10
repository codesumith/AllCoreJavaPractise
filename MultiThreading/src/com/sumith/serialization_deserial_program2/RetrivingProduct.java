package com.sumith.serialization_deserial_program2;

import java.io.*;

public class RetrivingProduct {
	
	public static void main(String[] args) throws IOException{
		
		var fis =new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/ProductData.txt");
		
		var ois =new ObjectInputStream(fis);
		
		try(fis;ois)
		{
			Product p;
			while((p =(Product)ois.readObject())!=null)
			{
				System.out.println(p);
			}
		}
		
		catch(Exception e)
		{
			System.err.println(e);
		}
		System.out.println("Object data retrieved successfully");
	}

}
