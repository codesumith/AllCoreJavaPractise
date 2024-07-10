package com.sumith.baby_milk;

public class Main {

	public static void main(String[] args) {
		
		Milk amul =new Milk("Amul",55);
		System.out.println(amul);
		
		Baby b= new Baby("kiara", 2, amul);
				System.out.println(b);

	}

}
