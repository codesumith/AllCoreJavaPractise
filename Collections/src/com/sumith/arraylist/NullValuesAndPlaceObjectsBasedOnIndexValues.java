package com.sumith.arraylist;

import java.util.ArrayList;

public class NullValuesAndPlaceObjectsBasedOnIndexValues {

	public static void main(String[] args) {
		
		ArrayList<Object> a1=new ArrayList<>();
		
		a1.add(12);
		a1.add("sun");
		a1.add(12);
		a1.add(3,"Hyderabad"); // add ( int Index, Object o) method of list interface
		
		a1.add(1,"Naresh");
		a1.add(null);
		a1.add(11);
		
		System.out.println(a1);
		
      //12,naresh,sun,12,hyd,null,11
	}

}
