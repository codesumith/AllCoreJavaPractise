package com.sumith.filehandling;

import java.io.*;

public class File7Image {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		var image=new FileInputStream("/Users/sumith/Desktop/HTML/IMAGES/city.jpg");
		
		var f1=new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/a.jpg");

		var f2=new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/b.jpg");
		
		var f3=new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/c.jpg");
		
		var bout =new ByteArrayOutputStream();
		
		try(image;f1;f2;f3)
		{
			int i;
			while((i=image.read())!=-1)
			{
				bout.write(i);
			}
			
			bout.writeTo(f1);
			bout.writeTo(f2);
			bout.writeTo(f3);
			System.out.println("Success");
			bout.flush();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
