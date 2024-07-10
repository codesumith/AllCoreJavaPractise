package com.sumith.TestOct14;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseElements {

	public static void main(String[] args) {
		
ArrayList <String>al=new ArrayList<>();
		
		al.add("Red");
		al.add("Green");
		al.add("Black");
		al.add("White");
		al.add("Pink");
		
		ListIterator<String> itr=al.listIterator();
		
		System.out.println("---Elements in List---");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Elements After Reverse---");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}

}
