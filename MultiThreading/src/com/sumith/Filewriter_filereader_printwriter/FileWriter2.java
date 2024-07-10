package com.sumith.Filewriter_filereader_printwriter;

import java.io.*;

public class FileWriter2 {

	public static void main(String[] args) throws IOException
	{
		var fw=new FileWriter("/Users/sumith/Desktop/JavaIoFiles/Data.txt");
		
		var bw=new BufferedWriter(fw);
		
		try(fw;bw)
		{
			char ch []= {'H','e','l','l','o',' ','W','o','r','l','d'};
			
			bw.write(ch);
			
			System.out.println("Success...");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
