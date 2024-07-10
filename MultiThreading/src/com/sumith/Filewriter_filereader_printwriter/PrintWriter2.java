package com.sumith.Filewriter_filereader_printwriter;

import java.io.*;

public class PrintWriter2 {
	
	public static void main(String[] args) throws IOException{
		
		var fileName="/Users/sumith/Desktop/JavaIoFiles/Append.txt/";
		
		var fileWriter=new FileWriter(fileName,true);
		
		var bufferedWriter =new BufferedWriter(fileWriter);
		
		try(fileWriter;bufferedWriter)
		{
			String textToAppend ="My name is Sumith.";
			bufferedWriter.write(textToAppend);
			bufferedWriter.newLine();
		}
		
		catch(IOException e)
		{
			System.out.println("An error occured while appending the text to the file:"+e.getMessage());
		}
	}

}
