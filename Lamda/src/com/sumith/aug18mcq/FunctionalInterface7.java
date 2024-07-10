package com.sumith.aug18mcq;
@FunctionalInterface 
interface Str1
{
	String str(String str);
}

public class FunctionalInterface7 {
	public static void main(String[] args) {
		Str1 nit = s -> "Naresh"+s;
		System.out.println(nit.str("IT"+" Hello"));	
	}
}