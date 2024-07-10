package com.sumith.programing_on_io_oct5;

import java.io.*;
import java.util.Scanner;


public class StoringObjectDataInFile
{
    public static void main(String[] args) throws IOException
    {
        // write the logic by creating the proper class as per the 
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter how many objects you want to store :");
    	int num=sc.nextInt();
    	
        FileOutputStream fos=new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/StudentDetailsObjectInput.txt");
    	
    	ObjectOutputStream oos=new ObjectOutputStream(fos);
    	
    	
    	
    	for(int i=1;i<=num;i++)
    	{
    		oos.writeObject(Student.storeStudentObjects());
    		System.out.println("-------------------------");
    	}
    	
    	oos.close();
    	sc.close();
    	
    	
    	
    	
    	
        // requirement
    }
}