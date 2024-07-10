package com.sumith.labworkMcqOct12;


import java.util.ArrayList;
import java.util.List;
public class Demo {
	@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
List list1 = new ArrayList();
list1.add("M");
list1.add("E");
List list2 = list1;
list1.add("R");
list1.add("I");
list1.add("T");
System.out.format("%s", list1);
System.out.format("%s", list2);
}

}