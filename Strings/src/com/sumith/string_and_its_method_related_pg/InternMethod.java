package com.sumith.string_and_its_method_related_pg;

public class InternMethod {

	public static void main(String[] args) {
		
		String s1=new String("india");
		String s2=new String("india");
		System.out.println(s1==s2);
		
		
		s1=s1.intern();
		s2=s2.intern();
		System.out.println(s1==s2);
		
		String s3="Hyd";
		String s4= new String("Hyd");
		System.out.println(s3==s4);
		s4=s4.intern();
		System.out.println(s3==s4);
	}

}
