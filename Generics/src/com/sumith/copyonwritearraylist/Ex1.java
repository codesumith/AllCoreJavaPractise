package com.sumith.copyonwritearraylist;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class Ex1 {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Apple","Orange","Mango","Kiwi","Grapes");
		
		
		CopyOnWriteArrayList<String> copyOnWriteList =new CopyOnWriteArrayList<String>(list);
		
		System.out.println("Without Modification ="+copyOnWriteList);
		
		//Iterator1
		
		Iterator<String> iterator1 =copyOnWriteList.iterator();
		
		//Add one element and verify list is updated
		
		copyOnWriteList.add("Guva");
		
		System.out.println("After Modification ="+copyOnWriteList);
		
		//Iterator1
		
				Iterator<String> iterator2 =copyOnWriteList.iterator();
				
				System.out.println("Elements from first Iterator:");
				iterator1.forEachRemaining(System.out :: println);
				
				System.out.println("Elements from second Iterator:");
				iterator2.forEachRemaining(System.out :: println);
				
	} 

}
