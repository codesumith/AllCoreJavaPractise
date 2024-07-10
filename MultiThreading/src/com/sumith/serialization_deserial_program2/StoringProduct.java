package com.sumith.serialization_deserial_program2;

import java.io.*;
import java.util.Scanner;

public class StoringProduct {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		
		var fos=new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/ProductData.txt");
		
		var oos=new ObjectOutputStream(fos);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter how many product objects you want to store ? :");
		int obj=sc.nextInt();
		
		for(int i=1;i<=obj;i++)
		{
			Product productObject= Product.getProductObject();
			oos.writeObject(productObject);
		}
		
		System.out.println("File created succefully!!!");
		
	}

}
