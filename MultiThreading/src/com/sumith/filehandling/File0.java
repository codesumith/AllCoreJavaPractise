package com.sumith.filehandling;

import java.io.File;
import java.io.IOException;

public class File0 {

	public static void main(String[] args) {
		
		try
		{
			File f=new File("/Users/sumith/Desktop/JavaIoFiles/Hello.txt");
			
			if(f.exists())
			{
				System.out.println("File is existing.");	
			}
			else
			{
				System.out.println("File is not existing");
			}
			
			if(f.createNewFile())
			{
				System.out.println("File is created.");
			}
			else
			{
				System.out.println("File is already existing...");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
