package com.sumith.mcq_ioPackage_oct3;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
		System.out.println(file.getFD());
		file.close();
	}
}