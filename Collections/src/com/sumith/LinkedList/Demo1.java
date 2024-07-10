package com.sumith.LinkedList;


import java.util.*;

public class Demo1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
List list=new LinkedList();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add(null);
list.add(42);

list.forEach(x-> System.out.println(x));
		


	}

}
