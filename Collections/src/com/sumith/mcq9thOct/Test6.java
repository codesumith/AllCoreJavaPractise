package com.sumith.mcq9thOct;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test6 {
	@SuppressWarnings({ "unchecked", "rawtypes" })

public static void main(String args[])
{
Vector vector = new Vector();
vector.add("one");
vector.add("two");
vector.add("three");
vector.add("four");
System.out.println("Original vector: " + vector);
List list = new ArrayList();
list.add("one");
list.add("two");
list.add("five");
vector.addAll(list);
System.out.print("After add all: " + vector);
}
}