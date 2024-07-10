package com.sumith.labworkMcqOct12;
import java.util.ArrayList;
import java.util.List;
public class Demo7 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
List l = new ArrayList() ;

    l.add("10");
    l.add("20");
    l.add("30");
    l.add("10");
    ArrayList l1 = new ArrayList(l);
    l1.add(40);
    System.out.println(l1);

    }
}




