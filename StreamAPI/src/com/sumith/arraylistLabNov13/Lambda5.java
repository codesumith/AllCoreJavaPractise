package com.sumith.arraylistLabNov13;

import java.util.function.*;

/*
 * @Functional interface 
 * Public Interface Predicate<T>
 * {
 * boolean test(T x);
 * }
 */
public class Lambda5 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		Predicate<Integer> p1 =num -> num%2==0;
		System.out.println("Number is even :"+p1.test(12));
		System.out.println("Number is even :"+p1.test(13));
		
		Predicate<Integer> p2 =num ->num>=18;
		System.out.println("Person is eligible for voting :"+p2.test(19));
		System.out.println("Person is eligible for voting :"+p2.test(17));
		
		Predicate<String> p3 = name -> name.startsWith("S");
		System.out.println(p3.test("Salar"));
		
		Predicate<Integer> p4 =year -> year%4==0;
		
		Consumer<String> c1= str -> System.out.println(str);
		c1.accept("Lonely");
		
		Consumer<Integer> c2= num -> System.out.println(num*num);
		c2.accept(2);
		
		Function<String,Integer> f1 = st -> st.length();
		System.out.println(f1.apply("sumith"));
		
		Function<Integer,Integer> f2= sr -> sr*sr;
		System.out.println(f2.apply(4));
		
		
		
	}

}
