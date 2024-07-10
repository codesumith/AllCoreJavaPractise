package com.sumith.SerializableAndDeserializableOnArrayList_Object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialization {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Product> list =new ArrayList<>();
		
		list.add(new Product(1,"Laptop"));
		list.add(new Product(2,"I phone"));
		list.add(new Product(3,"Mobile"));

		FileOutputStream fos= new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/Product.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		
		FileInputStream fis= new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/Product.txt");
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		try(fos;oos;fis;ois)
		{
			oos.writeObject(list);
			
			@SuppressWarnings("unchecked")
			ArrayList<Product> list1=(ArrayList<Product>)ois.readObject();
			
			System.out.println(list1);
		}//end of try with resource
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
