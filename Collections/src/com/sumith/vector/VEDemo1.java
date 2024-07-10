package com.sumith.vector;

import java.util.Vector;

public class VEDemo1 {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>(100,9); //initial capacity is 100 
		
		System.out.println("Intial capacity : "+v.capacity());
		
		for(int i=0;i<100;i++)
		{
			v.add(i);
		}
		System.out.println("After adding 100 elements : "+v.capacity());
		v.add(100);
		System.out.println("After addding 101th element "+v.capacity());
		
		System.out.println(v);
		
	}
}
