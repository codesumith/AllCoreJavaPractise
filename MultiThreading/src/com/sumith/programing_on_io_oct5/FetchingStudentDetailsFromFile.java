package com.sumith.programing_on_io_oct5;

import java.io.*;


public class FetchingStudentDetailsFromFile {

	public static void main(String[] args) throws IOException {
		
        FileInputStream fis=new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/StudentDetailsObjectInput.txt");
    	
    	ObjectInputStream ois =new ObjectInputStream(fis);
    	try(fis;ois)
    	{
    	Student details; 
    	
    	while((details=(Student) ois.readObject()) != null)
    	{
    		System.out.println(details);
    	}
    	}
    	catch(Exception e )
    	{
    		e.getMessage();
    	}
       
       ois.close();
    	

	}

}
