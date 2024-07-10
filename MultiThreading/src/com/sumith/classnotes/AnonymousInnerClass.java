package com.sumith.classnotes;

public class AnonymousInnerClass {

	public static void main(String[] args) {

		// Anonymous inner class
		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				String name = Thread.currentThread().getName();
				System.out.println(name + " thread is running.");

			}

		};
		
		
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " thread is running.@@@@@");

		Thread t1 = new Thread(r1, "Child1");
		t1.start();

	}

}
