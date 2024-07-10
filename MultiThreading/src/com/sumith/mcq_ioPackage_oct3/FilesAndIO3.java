package com.sumith.mcq_ioPackage_oct3;

import java.io.File;

public class FilesAndIO3 {
	public static void main(String[] args) {
		File file = new File("/Users/sumith/Desktop/JavaIoFiles/India.txt");
		System.out.println(file.isFile());
	}
}