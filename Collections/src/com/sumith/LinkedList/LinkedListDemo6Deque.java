package com.sumith.LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDemo6Deque {

	public static void main(String[] args) {
		// create a linked list and treat it as a deque
Deque<String> deque=new LinkedList<>();

//adding elements to the front of the deque
deque.addFirst("Ravi");
deque.addFirst("Raj");

//adding elements to the back of the deque
deque.addLast("Pallavi");
deque.addLast("Sweta");

System.out.println("Deque :"+deque);

String first=deque.removeFirst();
String last=deque.removeLast();

System.out.println("Removed first Element:"+first);
System.out.println("Removed last Element:"+last);
System.out.println("Updated deque:"+deque);

	}

}
