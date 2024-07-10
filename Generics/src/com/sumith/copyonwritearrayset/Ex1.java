package com.sumith.copyonwritearrayset;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Ex1 {
	
	public static void main(String[] args) {
		ArrayList<String>list =new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Grapes");
		list.add("Grapes");
		
		CopyOnWriteArraySet<String> set =new CopyOnWriteArraySet<String>(list);
		System.out.println("Elemets from set :"+set);
		
	}

}
