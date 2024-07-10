package com.sumith.filehandling;

import java.io.*;

public class SequenceInpStream4 {

	public static void main(String[] args) throws IOException{
		//This will read the data from two files at same time
		
		var f1=new FileInputStream("/Users/sumith/eclipse-workspace/MultiThreading/src/com/sumith/filehandling/File1.java");
		
		var f2=new FileInputStream("/Users/sumith/eclipse-workspace/MultiThreading/src/com/sumith/filehandling/File2.java");
		
		var s=new SequenceInputStream(f1,f2);
		
		try(f1;f2;s)
		{
			int i;
			while(true)
			{
				i=s.read();
				if(i==-1) break;
				System.out.print((char)i);
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
