package com.sumith.mcqio4Oct;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilesAndIO2 {
	public static void main(String[] args) throws IOException {
		InputStream file = new FileInputStream("\\hai.txt");
		System.out.println(file.getClass());
		file.close();
	}
}