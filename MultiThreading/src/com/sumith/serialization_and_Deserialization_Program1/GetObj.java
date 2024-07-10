package com.sumith.serialization_and_Deserialization_Program1;

import java.io.*;

public class GetObj {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fos=new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/ObjectEmployee.txt");
	    
		ObjectInputStream ois=new ObjectInputStream(fos);
		
		try(fos;ois)
		{
			Employee e;
			while((e =(Employee)ois.readObject())!=null)
					{
				System.out.println(e);
					}
		}
		catch( Exception ee)
		{
			System.out.println("End of file reached :"+ee);
		}
	}
}
