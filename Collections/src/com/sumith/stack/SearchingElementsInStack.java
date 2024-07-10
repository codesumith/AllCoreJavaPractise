package com.sumith.stack;

import java.util.Stack;

public class SearchingElementsInStack {

	public static void main(String[] args) {
		
		Stack<String> stk= new Stack<String>();
		
		stk.push("Apple");
		stk.push("Grapes");
		stk.push("Mango");
		System.out.println("OffSet Positon is :"+stk.search("Grapes"));//1
		
		System.out.println("OffSet Position is :"+stk.search("Banana"));//-1
		
		System.out.println("Is stack empty ?"+stk.isEmpty()); //false
		
		System.out.println("Index position is :"+stk.indexOf("Mango"));//2
	}

}
