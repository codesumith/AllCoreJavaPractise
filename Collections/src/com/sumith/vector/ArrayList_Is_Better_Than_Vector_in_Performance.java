package com.sumith.vector;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_Is_Better_Than_Vector_in_Performance {

	public static void main(String[] args) {
		
		long startTime =System.currentTimeMillis();
		
		Vector<Integer> v=new Vector<>();
		
		for(int i=0;i<=1000000;i++)
		{
			v.add(i);
		}
		
		long endTime =System.currentTimeMillis();
		
		System.out.println("Time taken by vector :"+(endTime-startTime)+"ms");
		
		//start time for ArrayList
		startTime =System.currentTimeMillis();
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<=1000000;i++)
		{
			al.add(i);
		}
		
		endTime =System.currentTimeMillis();
		
		System.out.println("Time taken by ArrayList :"+(endTime-startTime)+"ms");
	}
}
