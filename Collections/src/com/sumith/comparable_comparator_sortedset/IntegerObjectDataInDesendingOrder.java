package com.sumith.comparable_comparator_sortedset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IntegerObjectDataInDesendingOrder {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(67);
		al.add(57)
;
		al.add(47);
		al.add(37);
		al.add(17);
		
		Comparator<Integer> descSort = (i1,i2) -> -(i1-i2);
		
		Collections.sort(al,descSort);
		
		al.forEach(x -> System.out.println(x));
	}

}
