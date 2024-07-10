package com.sumith.labworkMcqOct12;
import java.util.ArrayList;

public class Demo8 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
ArrayList obj1 = new ArrayList();
ArrayList obj2 = new ArrayList();
obj1.add("A");
obj1.add("B");
obj2.add("A");
obj2.add(1,"B");
System.out.println(obj1.equals(obj2));
}
}