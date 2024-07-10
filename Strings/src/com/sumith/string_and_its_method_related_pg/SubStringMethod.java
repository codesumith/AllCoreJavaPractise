package com.sumith.string_and_its_method_related_pg;

public class SubStringMethod {

	public static void main(String[] args) {
		
		String x="HYDERABAD";
		
		String s1="Hello World";
		
		String s2=s1.substring(0,4);
		
		System.out.println(s2);
		
		
		System.out.println(x.substring(2,7));
		
		System.out.println(x.substring(3));
		
		System.out.println(x.substring(3, 3));
		
		//System.out.println(x.substring(6, 3));//java.lang.StringIndexOutOfBoundsException
		
		//System.out.println(x.substring(6, -3));//java.lang.StringIndexOutOfBoundsException

	}

}
