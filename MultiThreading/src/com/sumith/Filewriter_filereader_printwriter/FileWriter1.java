package com.sumith.Filewriter_filereader_printwriter;

import java.io.*;

public class FileWriter1 {

	public static void main(String[] args) throws IOException
{
		
		var fw=new FileWriter("/Users/sumith/Desktop/JavaIoFiles/HelloIndia.txt");
		
		var bw=new BufferedWriter(fw);
		
		try(fw;bw)
		{
			bw.write("Hello India, It is a great Country");
			System.out.println("Success...");
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}

	}

}
