package com.sumith.oct20;

import java.util.HashMap;
import java.util.Map;

public class Pg08 {

	public static void main(String[] args) {
		
		Map<Integer,String> m1= new HashMap<>();
		
		m1.put(1,"Red");
		m1.put(2, "Green");
		m1.put(3, "Black");
		
		System.out.println(m1.values());

	}

}
