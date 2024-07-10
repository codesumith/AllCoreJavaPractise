package com.sumith.filehandling;

import java.io.*;

public class File2 {

	public static void main(String[] args) {
		
		try(var fin =new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/India.txt"))
				{
					while(true)
					{
						
						int i=fin.read();
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
