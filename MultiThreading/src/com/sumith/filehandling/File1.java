package com.sumith.filehandling;

import java.io.*;

public class File1 {

	public static void main(String[] args) {
		
		try(var fout =new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/India.txt"))
		{
			String s="India is Great country";
			byte b[]=s.getBytes();
			fout.write(b);
			
			System.out.println("Success...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
