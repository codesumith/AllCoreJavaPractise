package com.sumith.filehandling;

import java.io.*;

public class ByteArray6 {

	public static void main(String[] args)throws IOException {
		
		var fin =new FileInputStream("/Users/sumith/eclipse-workspace/MultiThreading/src/com/sumith/filehandling/File1.java");
		
		var f1= new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/a.txt");

		var f2= new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/b.txt");
		
		var f3= new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/c.txt");
		
		var bout = new ByteArrayOutputStream();
		
		try(fin;f1;f2;f3;bout)
		{
			int i;
			while((i=fin.read())!=-1)
			{
				bout.write((byte)i);//writing the data to byteArrayOutputStream
				
			}
			bout.writeTo(f1);
			bout.writeTo(f2);
			bout.writeTo(f3);
			bout.flush();  // Clear the buffer for reusing of byteArrayStream
			
			System.out.println("Success");
			}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
