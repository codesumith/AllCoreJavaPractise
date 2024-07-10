package com.sumith.mcq9thOct;

import java.util.Vector;

public class Test5 {
	@SuppressWarnings({ "unchecked", "rawtypes" })

public static void main(String args[])
{
Vector vector = new Vector();
vector.add("Java ");
vector.add("is ");
vector.add("programming ");
vector.add("language");
System.out.println("Original vector: " + vector);
//vector.delete();
System.out.print("Vector after deletion: " + vector);
}
}