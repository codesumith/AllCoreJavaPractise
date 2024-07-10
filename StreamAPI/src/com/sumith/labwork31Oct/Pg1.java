package com.sumith.labwork31Oct;

import java.util.Scanner;
import java.util.function.Predicate;

public class Pg1 {
	
	public static boolean test(String p)
	{
		if(p.length()>6) {
			return true;
		}
		else
		{
		return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter String :");
		String ui =s.next();
		
		System.out.println("Traditional test :");
		if(Pg1.test(ui))
		System.out.println(" Yes Length is greater then 6");
		else
			System.out.println("No Length is not lessthan 6");
		
		System.out.println("---------------------------------\n");
		
		System.out.println("Using a Predicate with a lambda expression (p) :");
		
		 Predicate<String> p = x -> x.length()>6;

		 if(p.test(ui)) {
			 System.out.println(" Yes Length is greater then 6");
		 }
		 else
			 System.out.println("No Length is not lessthan 6");
		 
		 System.out.println("---------------------------------\n");
		 
			System.out.println("Using a shorter Predicate with a lambda expression :");

		 Predicate<String> p1 = x -> x.length()>6;
		 
		 System.out.println("Is length Greater than 6 :"+p1.test(ui));
		 
		 s.close();
	}

}
