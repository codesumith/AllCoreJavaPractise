package com.sumith.labworkoct19;


import java.util.Set;
import java.util.TreeSet;

public class ProductTesting {

	public static void main(String[] args) {
		
		Set<Product> st =new TreeSet<>((p1,p2)->p1.getProductExpiryDate().compareTo(p2.getProductExpiryDate()));
		st.add(new Product("HiddenSeek","1/1/2024"));
		st.add(new Product("Lays","5/1/2024"));
		st.add(new Product("HiddenSeek","3/1/2024"));
		
		st.forEach(pr -> System.out.println(pr));
		
	}

}
