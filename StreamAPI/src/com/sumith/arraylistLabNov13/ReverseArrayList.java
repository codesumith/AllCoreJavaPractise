package com.sumith.arraylistLabNov13;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println("ArrayList Before :"+al);
		Collections.reverse(al);
		System.out.println("After reversing :"+al);
	}

}
