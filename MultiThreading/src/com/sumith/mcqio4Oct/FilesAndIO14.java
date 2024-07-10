package com.sumith.mcqio4Oct;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilesAndIO14 {
	public static void nit() throws IOException {
		String str = "NareshIT";
		OutputStream fout = new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
		byte b[] = str.getBytes();
		fout.write(b,0,6);
		fout.flush();		
		fout.close();
	}
	
	@SuppressWarnings("resource")
	public static void nit1() throws IOException {
		InputStream fin = new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
		int count = fin.available();
		System.out.println(count);
		byte b[] = new byte[count];
		
		DataInputStream din = new DataInputStream(fin);
		din.read(b); 
		for(byte bite : b) 
		{
			System.out.print((char)bite);
		}
	}
	public static void main(String[] args) throws IOException {
		nit();
		nit1();
	}
}
