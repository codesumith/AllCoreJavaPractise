package com.sumith.mcqio4Oct;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO4 {
	public static void main(String[] args) throws IOException  {
		String str = "Welcome to NareshIT";
		FileOutputStream file = new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/google.txt");
		byte[] by = str.getBytes();
		file.write(by);
		file.close();
		System.out.println("Completed");
	}
}