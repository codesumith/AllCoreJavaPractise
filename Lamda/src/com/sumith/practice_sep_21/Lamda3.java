package com.sumith.practice_sep_21;

import java.util.Scanner;
import java.util.function.Function;

interface Length
{
	
	int getLength(String str);
	
}

public class Lamda3 {

	public static void main(String[] args) {
		
		Length l=str -> str.length();
		
		System.out.println("Length is : "+l.getLength("India"));
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name =sc.next();
		
		System.out.println("Length of "+name+" is :"+l.getLength(name));
		
		Function<Integer,Integer> f1= x -> x*x*x;
		System.out.println(f1.apply(5));
		
		sc.close();
	
		
		

	}

}
