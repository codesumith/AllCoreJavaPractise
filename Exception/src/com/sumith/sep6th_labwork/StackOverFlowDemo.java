package com.sumith.sep6th_labwork;

public class StackOverFlowDemo {
	
	public static void display() {
		System.out.println("Iam stackoverflow");
		display();
	}

	public static void main(String[] args) {
		
		display();

	}

}
