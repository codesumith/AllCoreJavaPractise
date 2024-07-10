package com.sumith.Assignement9thOct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseArrayList{

	
public static void main(String[] args) {
	ArrayList<Integer> ar =new ArrayList<Integer>();
	ar.add(1);
	ar.add(13);
	ar.add(44);
	ar.add(65);
	
	System.out.println("Normal for loop");
	
	for(int i=0;i<ar.size();i++) {
		System.out.print(ar.get(i)+" ");
	}
	
	System.out.println();
	
	System.out.println("For each loop");
	
	for (int i:ar)
	{
		System.out.print(i+" ");
	}
	
	System.out.println();
	System.out.println("Using lambda");
	
	ar.forEach(i-> System.out.print(i));
	
	System.out.println();
	
	System.out.println(ar.toString());
	
	

	System.out.println("List iterator");
	
ListIterator<Integer> itr= ar.listIterator();
	
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	
	System.out.println();
	
	System.out.println("iterator");
	
Iterator<Integer> itr1= ar.iterator();
	
	while(itr1.hasNext()) {
		System.out.print(itr1.next()+" ");
	}
	
	System.out.println();
	System.out.println("while loop");
	
	
 int val=0;
 while(ar.size()>val)
 {
	 System.out.print(ar.get(val)+" ");
	 val++;
 }
	
 System.out.println();
 System.out.println("Method reference");
 ar.forEach(System.out::print);
 
 System.out.println();
 System.out.println("Enumeration");
 
 
}
	
}
