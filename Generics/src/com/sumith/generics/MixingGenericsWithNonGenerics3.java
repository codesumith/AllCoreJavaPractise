package com.sumith.generics;

import java.util.*;

public class MixingGenericsWithNonGenerics3 {
	
	public static void main(String[] args) {
		
		List<Integer> myList =new ArrayList<>();
		
		myList.add(4);
		myList.add(6);
		
		UnknownClass2 u=new UnknownClass2();
		int total=u.addValues(myList);
		System.out.println(total);
		
	}

}

class UnknownClass2
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int addValues(List list)
	{
		list.add(5); // adding object to raw type
		Iterator it = list.iterator();
		int total =0;
		while (it.hasNext())
		{
			int i=(Integer)it.next();
			total+=i;
		}
		return total;
	}
}