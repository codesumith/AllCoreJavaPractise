package com.sumith.arraylist;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
ArrayList<String> ar=new ArrayList<>();//Generic type

ar.add("Apple");
ar.add("Orange");
ar.add("Grapes");
ar.add("Mango");
ar.add("Guva");
ar.add("Mango");

System.out.println("Contents of ar:"+ar);

ar.remove(2); //based on index position
ar.remove("Guva");

System.out.println("Contents after removing:"+ar);
System.out.println("Size of array list:"+ar.size());

Collections.sort(ar);

ar.forEach(x-> System.out.println(x));
	}

}
