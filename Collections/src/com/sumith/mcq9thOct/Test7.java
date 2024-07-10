package com.sumith.mcq9thOct;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test7 {
	@SuppressWarnings({ "unchecked", "rawtypes" })

public static void main(String args[])
{
Vector vector = new Vector();
//String test = "A";
vector.add("65");
vector.add("66");
vector.add("67");
vector.add("69");
vector.add("51");
List list = new ArrayList();
list.add("66");
list.add("67");
//int j = (int) test.charAt(0);
System.out.println("Vector contains all list elements: " + vector.containsAll(list));
list.add("j");
System.out.println("Vector contains all list elements: " + vector.containsAll(list));
System.out.println(list);
}
}