package com.sumith.Filewriter_filereader_printwriter;

import java.io.*;

public class FileReader2 {

	public static void main(String[] args) throws IOException{
		
		var fr=new FileReader("/Users/sumith/Desktop/HTML/IMAGES/unsplash.jpg");
		
		var fw=new FileWriter("/Users/sumith/Desktop/JavaIoFiles/splash.jpg");
		
		try(fr;fw)
		{
			int i;
			while((i=fr.read())!=-1)
			{
				
				fw.write(i);
			}
		}
		
		catch(Exception e)
		{
			
		}

	}

}
