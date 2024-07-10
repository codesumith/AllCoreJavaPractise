package com.sumith.filehandling;

import java.io.*;

public class FileToFile {

	public static void main(String[] args) throws IOException {
		
		// Outside of try (Java 9 enhancement in try with resource)
		
		var fin=new FileInputStream("/Users/sumith/eclipse-workspace/MultiThreading/src/com/sumith/filehandling/FileToFile.java");
		
		var fout =new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/FileToFile.txt");
		
		try(fin;fout)
		{
			while(true)
			{
				int i=fin.read();
				if(i==-1) break;
				System.out.print((char)i);
				fout.write((byte)i);
			}
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
