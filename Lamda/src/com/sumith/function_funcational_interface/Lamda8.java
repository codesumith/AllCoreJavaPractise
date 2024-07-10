package com.sumith.function_funcational_interface;

import java.util.Scanner;
import java.util.function.*;
public class Lamda8 {

	public static void main(String[] args) {
		
Function<Integer,Integer> f1 =x -> x*x*x;
System.out.println(f1.apply(10));

Function<String,Integer> f2 = str -> str.length();
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String name=sc.nextLine();
System.out.println("Length of the "+name+" is :"+f2.apply(name));
sc.close();
//System.out.println(f2.apply("Sumith"));

Function<String,Boolean> f3 = str -> str.startsWith("S");
System.out.println(f3.apply("sumith"));

Function<Character,Integer > f4= inDo -> (int)inDo;
System.out.println(f4.apply('A'));

	}

}
