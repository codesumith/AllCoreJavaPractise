package com.sumith.mcq_ioPackage_oct3;

import java.io.*;

public class FilesAndIO9 {
	public static void main(String[] args)throws IOException  
	{
		File file = new File("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
		boolean result = file.createNewFile();
		System.out.println(result);
	}
}