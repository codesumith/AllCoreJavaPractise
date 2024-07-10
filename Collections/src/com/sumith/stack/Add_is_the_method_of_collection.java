package com.sumith.stack;

import java.util.Stack;

public class Add_is_the_method_of_collection {

	public static void main(String[] args) {
		
		Stack<Integer>st=new Stack<>();
		
		st.add(10);
		st.add(20);
		st.forEach(x->System.out.println(x));
		
		Stack<String>st2=new Stack<>();
		st2.add("Java");
		st2.add("is");
		st2.add("Programming");
		st2.add("Language");
		st2.forEach(x -> System.out.println(x));
		
		Stack<Character>st3=new Stack<>();
		st3.add('A');
		st3.add('B');
		st3.forEach(x -> System.out.println(x));
		
		Stack<Double> st4=new Stack<Double>();
		st4.add(20.5);
		st4.add(10.5);
		st4.forEach(x -> System.out.println(x));
		

	}

}
