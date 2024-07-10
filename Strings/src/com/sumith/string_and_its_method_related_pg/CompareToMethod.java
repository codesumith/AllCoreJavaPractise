package com.sumith.string_and_its_method_related_pg;

public class CompareToMethod {

	public static void main(String[] args) {
		
		String s1="Sachin";
		String s2="Sachin";
		String s3="Ratan";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));//S>R
		System.out.println(s3.compareTo(s1));//R<S
		
		String s4 ="Apple";
		String s5="Ipple";
		
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.compareTo(s4));

	}

}
