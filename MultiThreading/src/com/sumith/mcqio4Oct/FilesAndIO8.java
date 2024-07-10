package com.sumith.mcqio4Oct;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO8 {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/hai.txt"));
		String str = "Welcome to NareshIT";
		buffer.write(str.getBytes());
		buffer.close();
		System.out.println("Completed");
	}
}