package com.sumith.oct20;

import java.util.ArrayList;
import java.util.List;

public class Pg1 {
	
	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		
		System.out.println("Before Replacing :"+l);
		l.set(1, "Orange");
		System.out.println("After Replacing :"+l);
	}

}
