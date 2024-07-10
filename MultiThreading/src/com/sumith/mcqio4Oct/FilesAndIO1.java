package com.sumith.mcqio4Oct;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilesAndIO1 {
	
	public static void main(String[] args) throws IOException {
		OutputStream file = new FileOutputStream("\\hai.txt");
		System.out.println(file.getClass());
		file.close();
	}
}