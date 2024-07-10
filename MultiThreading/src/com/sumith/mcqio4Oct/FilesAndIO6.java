package com.sumith.mcqio4Oct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO6 {
	public static void main(String[] args) {
		try {
			String str = "Welcome to NareshIT";
			FileOutputStream fileOut = new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
			byte[] by = str.getBytes();
			fileOut.write(by);
			fileOut.close();
			FileInputStream fileIn = new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
			System.out.println(fileIn.read());
			fileIn.close();
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}