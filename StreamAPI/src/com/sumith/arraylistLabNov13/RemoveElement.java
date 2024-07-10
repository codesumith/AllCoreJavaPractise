package com.sumith.arraylistLabNov13;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
	List<Integer> l =new ArrayList<>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
	
		l.remove(4);
		System.out.println("Array List remove"+l);
		
		l.remove(new Integer(2));
		System.out.println("Collection List remove"+l);
		

	}

}
