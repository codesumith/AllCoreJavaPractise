package com.sumith.cocurrentcollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Collection1 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50);
		
		System.out.println("ArrayList Elements :"+al);
		
		Set s=new HashSet(al);
		System.out.println();
		System.out.println("Set Elements are :"+s);
		
	}

}
