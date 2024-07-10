package com.sumith.Filewriter_filereader_printwriter;

import java.io.*;

public class FileReader1 {

	public static void main(String[] args) throws IOException{
		
		var fr=new FileReader(args[0]);
		
		var br=new BufferedReader(fr);
		
		try(fr;br)
		{
			while(true) 
			{
			int i=br.read();
			if(i==-1)	break;
			System.out.print((char)i);
			}
		}
catch(IOException e)
		{
	e.printStackTrace();
		}
	}

}
