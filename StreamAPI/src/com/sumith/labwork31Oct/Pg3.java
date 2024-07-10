package com.sumith.labwork31Oct;

import java.util.*;
import java.util.function.Predicate;

public class Pg3 {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,33,55,89,2,6,66,80,30);
		
		Predicate<Integer> p1 = z -> z>10;
		System.out.print("Greater than 10 :");
		l.forEach(x -> {
			if(p1.test(x))
				{
				System.out.print(" "+x);
				}
		});
//------------------------------------------------------------------------		
		Predicate<Integer> p2 = z -> z%2==0;
		System.out.print("\nDivisible by 2 :");
		l.forEach(x -> {
			if(p2.test(x))
				{
				System.out.print(" "+x);
				}
		});
		
		//------------------------------------------------------------------------		
				Predicate<Integer> p3 = z -> z%10==0;
				System.out.print("\nDivisible by 10 :");
				l.forEach(x -> {
					if(p3.test(x))
						{
						System.out.print(" "+x);
						}
				});
				
				//------------------------------------------------------------------------		
				Predicate<Integer> p4 = z -> z<10;
				System.out.print("\nLess than 10 :");
				l.forEach(x -> {
					if(p4.test(x))
						{
						System.out.print(" "+x);
						}
				});
	}

}
