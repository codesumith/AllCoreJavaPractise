package com.sumith.mcqio4Oct;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilesAndIO10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		InputStream fin = new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
		System.out.println(fin.available());
	}
}