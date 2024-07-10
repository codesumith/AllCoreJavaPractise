package com.sumith.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorMethods {

	public static void main(String[] args) {
		
		LinkedList<String> city=new LinkedList<>();
		
		city.add("Kolkata");
		city.add("Banglore");
		city.add("Hyderabad");
		city.add("Pune");
		System.out.println(city);
		
		ListIterator<String> lt= city.listIterator();
		
		while(lt.hasNext())
		{
			String x=lt.next();
			
			if(x.equals("Kolkata"))
			{
				lt.remove();
			}
			else if(x.equals("Hyderabad"))
			{
				lt.add("Ameerpet");
			}
			else if(x.equals("Pune"))
			{
				lt.add("Mumbai");
			}
		}
		
		city.forEach(x -> System.out.println(x)); //method references

	}

}
