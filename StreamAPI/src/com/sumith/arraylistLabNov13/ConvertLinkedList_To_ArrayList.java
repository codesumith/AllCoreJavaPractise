package com.sumith.arraylistLabNov13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedList_To_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> l =new LinkedList<>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
		System.out.println("Linked List"+l);
		
		
		List<Integer> al =new ArrayList<>();
		al.addAll(l);
		
		System.out.println("Array List"+al);

	}

}
