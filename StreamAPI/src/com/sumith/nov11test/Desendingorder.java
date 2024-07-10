package com.sumith.nov11test;

import java.util.Comparator;

public class Desendingorder implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o2.expirydate-o1.expirydate;
	}



	

}
