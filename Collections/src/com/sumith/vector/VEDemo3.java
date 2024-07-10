package com.sumith.vector;

import java.util.Collections;
import java.util.Vector;

public class VEDemo3 {

	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<>();
		
		int x[]= {22,30,10,40,15,58};
		
		//Adding array values to vector 
		
		for (int i=0;i<x.length;i++)
		{
			v.add(x[i]);
		}
		
		Collections.sort(v);
		
		System.out.println("Maximum element is :"+Collections.max(v));
		System.out.println("Minimum element is :"+Collections.min(v));
		System.out.println("Vector elements :");
		v.forEach(y -> System.out.println(y));
	}
}
