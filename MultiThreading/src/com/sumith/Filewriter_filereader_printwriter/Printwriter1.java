package com.sumith.Filewriter_filereader_printwriter;

import java.io.*;

public class Printwriter1 {
	
	public static void main(String[] args)throws IOException 
	{
		PrintWriter writeData =new PrintWriter("/Users/sumith/Desktop/JavaIoFiles/Roll.txt");
		
		try(writeData)
		{
			int roll=15;
			//Writing primitive data into text format
			writeData.printf("My roll number is : %d", roll);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}