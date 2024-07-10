package com.sumith.oct20;

import java.util.HashMap;
import java.util.Map;

public class Pg07 {
	
	public static void main(String[] args) {
		
	
	
	Map<Integer,String> m1= new HashMap<>();
	
	m1.put(1,"Red");
	m1.put(2, "Green");
	m1.put(3, "Black");
	
	System.out.println("Values in first map:"+m1);
	
   Map<Integer,String> m2= new HashMap<>();
	
	m2.put(4,"White");
	m2.put(5, "Blue");
	m2.put(6, "Orange");
	
	System.out.println("Values in second map:"+m2);
	m2.putAll(m1);
	System.out.println("Now values in second map :"+m2);
	
	
	
	}

}
