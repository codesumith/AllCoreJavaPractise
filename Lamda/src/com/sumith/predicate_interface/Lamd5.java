package com.sumith.predicate_interface;

import java.util.function.*;

public class Lamd5 {

	
	public static void main(String[] args) {
		
		Predicate <Integer> p1= num -> num%2 ==0;
		System.out.println("Number is even: "+p1.test(5));
		System.out.println("Number is even: "+p1.test(4));
		
		
		Predicate <Integer> p2= age -> age>=18;
		System.out.println("Person is eligible for voting: "+p2.test(19));
		System.out.println("PErson is eligibel for voting:" +p2.test(15));
		
		Predicate <String> p3= str ->str.startsWith("R");
		System.out.println("Do name Starts with r: "+p3.test("Anil"));
		System.out.println("Do name Starts with r: "+p3.test("Ravinder"));
		
		Predicate <String> p4 =str ->str.equals("Ravinder");
		System.out.println("Are you Ravinder?: "+p4.test("Ravinder"));
		System.out.println("Are you Ravinder?: "+p4.test("Sumith"));
		
		Predicate <Integer> p5= year -> year%4==0;
		System.out.println("IS this 2024 LeapYear: "+p5.test(2024));
		System.out.println("IS this 2025 LeapYear: "+p5.test(2025));
	}
}
