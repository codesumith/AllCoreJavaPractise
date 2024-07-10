package com.sumith.nov11test;

import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		
		TreeSet<Product> ts =new TreeSet<>(new Desendingorder());
		
		ts.add(new Product("mouse",12));
		ts.add(new Product("keybord",13));
		ts.add(new Product("laptop",34));

		System.out.println(ts);
	}

}
