package com.sumith.string_and_its_method_related_pg;

public class ToVerifyHashcode {

	public static void main(String[] args) {
		
String s1="india";
String s2=new String("india");

String s3=new String ("india");
int ch=(int)'a';
System.out.println(ch);
System.out.println(s2);
System.out.println(s1.hashCode()+" : "+s2.hashCode()+" : "+s3.hashCode());

	}

}
