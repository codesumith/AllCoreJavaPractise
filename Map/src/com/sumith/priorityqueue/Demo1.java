package com.sumith.priorityqueue;

import java.util.PriorityQueue;

public class Demo1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq =new PriorityQueue<>();
		pq.add("9");
		pq.add("8");
		pq.offer("7");
		System.out.println(pq.peek()+" ");
		pq.add("6");
		pq.add("5");
		pq.add("3");
		pq.remove("1");
		
		System.out.println(pq.poll()+" ");
		
		if(pq.remove("2"))
			System.out.println(pq.poll()+" ");
System.out.println(pq.poll()+ " "+pq.peek());
System.out.println(pq);
	}

}
