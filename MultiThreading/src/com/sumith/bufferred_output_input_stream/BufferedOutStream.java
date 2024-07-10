package com.sumith.bufferred_output_input_stream;

import java.io.*;

public class BufferedOutStream {
public static void main(String[] args) throws IOException
{
	FileOutputStream fout=new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/Hyderabad.txt");
	
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	
	try(fout;bout)
	{
		String s ="Hyderabad is nice city";
		byte [] b=s.getBytes();
		bout.write(b);
		System.out.println("Success...");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
