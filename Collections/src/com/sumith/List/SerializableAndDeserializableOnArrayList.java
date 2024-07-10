package com.sumith.List;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableAndDeserializableOnArrayList {

	public static void main(String[] args) throws IOException
	{
		
ArrayList<String> a1=new ArrayList<>();

a1.add("Nagpur");
a1.add("Vijaywada");
a1.add("Hyderabad");
a1.add("Jamshedpur");

//serialization
FileOutputStream fos =new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/City.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);


//De-serialization
FileInputStream fis =new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/City.txt");
ObjectInputStream ois=new ObjectInputStream(fis);

try(fos;oos;fis;ois)
{
	oos.writeObject(a1);  //serialization
	
	@SuppressWarnings("unchecked")
	ArrayList<String> list = (ArrayList<String>) ois.readObject();
	
	System.out.println(list);
}//end of try with resource

catch(Exception e)
{
	e.printStackTrace();
}

	}

}
