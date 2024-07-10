package com.sumith.filehandling;

import java.io.*;

public class File5 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f1=new FileInputStream("/Users/sumith/eclipse-workspace/MultiThreading/src/com/sumith/filehandling/File1.java");
		
		var f2=new FileInputStream("/Users/sumith/eclipse-workspace/MultiThreading/src/com/sumith/filehandling/File2.java");
		
		SequenceInputStream s=new SequenceInputStream(f1,f2);
		
		FileOutputStream fout=new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/SequenceInputStream.txt");
		
		int i;
		
		try (f1;f2;s;fout)
		{
			while(true)
			{
			i=s.read();
			
			if(i == -1) break;
			
			System.out.print((char)i);
			fout.write(i);
			}
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			
		}
System.out.println("File created succefully");
	}

}
