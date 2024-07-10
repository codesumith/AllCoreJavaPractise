package com.sumith.wildcardcharacter;

import java.util.ArrayList;
import java.util.List;

public class Test13 {
	
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		
		List<? extends Number> list1 =new ArrayList<Integer>();
		
		List<? super String> list2 =new ArrayList<String>();
		
		List<Integer> list3 =new ArrayList<Integer>();
		
		List list4 =new ArrayList();
		
		System.out.println("Yes");
	}

}
