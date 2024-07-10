package com.sumith.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MixingGenericsWithNonGenerics2 {

	public static void main(String[] args) {
		List<Integer> myList =new ArrayList<>();
		myList.add(4);
		myList.add(6);
		myList.add(5);
		
		UnknownClass u =new UnknownClass();
		int total =u.addValues(myList);
		System.out.println("The sum of integer object is :"+total);
		

	}

}

class UnknownClass
{
	@SuppressWarnings("rawtypes")
	public int addValues(List list) //safe object to unsafe object OR generic raw types
	{
		Iterator it=list.iterator();
		int total=0;
		while (it.hasNext())
		{
			int i=(Integer) it.next();
			total+=i;//total 15
		}
		return total;
	}
}
