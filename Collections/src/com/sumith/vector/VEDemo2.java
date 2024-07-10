package com.sumith.vector;

import java.util.Vector;

public class VEDemo2 {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector<>();
		
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		
		System.out.println("Fetching the elements of vector :");
		
		for (int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		v.add(11);
		System.out.println("Capacity :"+v.capacity());
	}
}
