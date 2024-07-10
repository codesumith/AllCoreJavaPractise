package com.sumith.bufferred_output_input_stream;

import java.io.*;

public class BufferedInStream {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fin=new FileInputStream("/Users/sumith/eclipse-workspace/MultiThreading/src/com/sumith/bufferred_output_input_stream/BufferedOutStream.java");
		
		var bin =new BufferedInputStream(fin);
		
		try(fin;bin)
		{
			int i;
			while((i=bin.read())!=-1)
			{
				System.out.print((char)i);
				
			}
		
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}
		System.out.println();

	}

}
