package com.sumith.string_and_its_method_related_pg;

public class ReplaceMethod {

	public static void main(String[] args) {
		

		String x="oxoxoxoxox";
		
		String s1="Hello";
		String s2=s1.replace('l', 'w');
		
		System.out.println(s2);
		
		System.out.println("Stirng before replacement : "+x);
		
		System.out.println("String after replacememt : "+x.replace('x','X'));

		String y="Manager";
		y=y.replace("Man", "Dam");
		System.out.println(y);
	}

}
