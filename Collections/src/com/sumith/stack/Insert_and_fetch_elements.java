package com.sumith.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Insert_and_fetch_elements {

	public static void main(String[] args) {
		
		Stack<Integer> s= new Stack<>();
	
		try
		{
			s.push(12);
			s.push(15);
			s.push(22);
			s.push(33);
			s.push(49);
			System.out.println("After insertion elements are :"+s);
			
			System.out.println("Fetching the elements using pop method");
			
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			
		   System.out.println("After deletion elements are :"+s);
		   
		   System.out.println("Is the stack is empty ? :"+s.isEmpty());
		   
		   System.out.println(s.pop());
			
		}//end of try
		
		catch(EmptyStackException e) {//e.printStackTrace();
			System.out.println(" Stack is empty");}
		}
	}

