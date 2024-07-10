package com.sumith.string_classnotes_programs;

public class StringIntern {

	public static void main(String[] args) {
		
String x ="Sumith";

String y =new String ("Sumith");

System.out.println(x==y);

y=y.intern();

System.out.println(x==y);

	}

}
