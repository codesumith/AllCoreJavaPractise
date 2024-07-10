package com.sumith.list_interface;

import java.util.*;


public class FetchingCollectionData {
	
	public static void main(String[] args) {
		
		Vector <String> fruits =new Vector<>();
		
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Manago");
		fruits.add("Guava");

		Collections.sort(fruits);
		
		//1
		System.out.println("Fetching the data from Enumeration Interface");
		
		Enumeration<String> elements=fruits.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
		
		//2
	System.out.println("Fetching the data from ordinary for loop.");
	
	for(int i=0;i<fruits.size();i++)
	{
		System.out.println(fruits.get(i));
	}
	
		//3
	System.out.println("Fetching data from for each loop.");
	
	for(String fruit:fruits)
	{
		System.out.println(fruit);
	}
	//4
	System.out.println("Fetching data from Iteration Interface.");
	
	Iterator<String> itr=fruits.iterator();
	
	while (itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//5
	System.out.println("Fetching data from ListIterator Interface.");
	
	ListIterator<String>li=fruits.listIterator();
	
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	
	//6
	System.out.println("Fetching the data from for each method.");
	fruits.forEach(x->System.out.println(x));
    //7
	System.out.println("IN BACKWARD DIRECTION.");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	
	}
	
	
}
