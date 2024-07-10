package com.sumith.Linkedhashset;

import java.util.LinkedHashSet;

public class LinkhashDemo1 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lk=new LinkedHashSet<>();
		
		lk.add(10);
		lk.add(5);
		lk.add(15);
		lk.add(20);
		lk.add(5);
		
		
		System.out.println("LinkedHashSet elements :"+lk);
		
		System.out.println("LinkedHashSet size:"+ lk.size());
		
		int elementToCheck =15;
		
		if(lk.contains(elementToCheck))
		{
			System.out.println(elementToCheck+" is present in the LinkedHashSet");
		}
		else
		{
			System.out.println(elementToCheck+" is not present in the LinkedHashSet");
	
		}
		
		int elementToRemove=10;
		lk.remove(elementToRemove);
		
		System.out.println("After removing "+ elementToRemove+", LinkedHashSet elements :"+lk);
		
		lk.clear();
		
		System.out.println("After clearing, linkedHashSet elements :"+lk);
		
		
	}

}
