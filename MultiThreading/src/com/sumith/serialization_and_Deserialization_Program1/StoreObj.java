package com.sumith.serialization_and_Deserialization_Program1;


import java.io.*;

public class StoreObj {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		FileOutputStream fos=new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/ObjectEmployee.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		try(br;fos;oos)
		{
			System.out.print("How many objects you want to write :");
			int n=Integer.parseInt(br.readLine());
			
			for(int i=1;i<=n;i++)
			{
				Employee e1= Employee.getData();
				oos.writeObject(e1);
				
				System.out.println("---------------------------");
			}
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
