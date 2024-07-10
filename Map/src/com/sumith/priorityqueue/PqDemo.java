package com.sumith.priorityqueue;

import java.util.PriorityQueue;

public class PqDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Guava");
		
		System.out.println(pq.peek());//Apple 
		System.out.println(pq.poll());//Apple
		System.out.println(pq.peek());//Guava
		System.out.println(pq);
	}

}
