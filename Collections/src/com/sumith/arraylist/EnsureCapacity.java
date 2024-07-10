package com.sumith.arraylist;
import java.util.ArrayList;

public class EnsureCapacity
{
	public static void main(String[] args) 
	{
		ArrayList<String> city= new ArrayList<>();//default capacity is 10
		city.ensureCapacity(3);//resized the arraylist to store 3 elements.

		city.add("Hyderabad");
		city.add("Mumbai");
		city.add("Delhi"); 

		city.add("Kolkata");
		
		
		System.out.println("ArrayList: " + city);		
	 }
}