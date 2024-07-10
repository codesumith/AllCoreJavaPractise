package com.sumith.string_and_its_method_related_pg;

public class Difference_between_equal_operator_and_Equals_method {

	public static void main(String[] args) {
		
		String s1="India";
		String s2="India";
		String s3=new String ("India");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}

}
