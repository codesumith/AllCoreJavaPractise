package com.sumith.cocurrentcollection;

import java.util.*;


public class Collections2 {
	
	public static void main(String[] args) {
		ArrayList<String> arl =new ArrayList<>();
		arl.add("Apple");
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");
		
		List<String> syncCollection =Collections.synchronizedList(arl);
		List<String> upperList=new ArrayList<>();
		
		Runnable listOperations =() ->
		{
		synchronized(syncCollection)
		{
			syncCollection.forEach(str -> upperList.add(str.toUpperCase()));
		}
		};
		
		Thread t =new Thread(listOperations);
		t.start();
		
		upperList.forEach(x -> System.out.println(x));
		
	}

}
