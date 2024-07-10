package com.sumith.List;

import java.util.*;

public class FetchElementsInForwardAndBackWardDirection {

	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("Ravi","Rahul","Sweta","Ananya","Bina");
		
		Collections.sort(list);
		Collections.reverse(list);
		
		ListIterator<String> itr =list.listIterator();
		
		System.out.println("Transvaring elemnts in forward direction...");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Transerving elements in backward");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
