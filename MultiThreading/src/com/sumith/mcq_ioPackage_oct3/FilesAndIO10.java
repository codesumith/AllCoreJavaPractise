package com.sumith.mcq_ioPackage_oct3;

import java.io.File;

public class FilesAndIO10 {
	public static void main(String[] args)  
	{
		File file = new File("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
		boolean result = file.exists();
		System.out.println(result);
		
	}
}