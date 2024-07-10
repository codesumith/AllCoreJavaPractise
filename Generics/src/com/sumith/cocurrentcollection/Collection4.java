package com.sumith.cocurrentcollection;

import java.util.*;

public class Collection4 {
	
	public static void main(String[] args) {
	
	Map<String,String> m=Collections.synchronizedMap(new HashMap<>());
	m.put("1","Ravi");
	m.put("4","Elina");
	m.put("3","Aryan");
	System.out.println("Synchronized map is :"+m);
	
	}

}
