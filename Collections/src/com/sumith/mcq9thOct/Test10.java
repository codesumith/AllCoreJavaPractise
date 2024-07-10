package com.sumith.mcq9thOct;

import java.util.Collections;
import java.util.Vector;

public class Test10 {
	@SuppressWarnings({ "unchecked", "rawtypes" })

public static void main(String[] args) {
Vector c=new Vector();
c.add("M");
c.add("E");//0
c.add("R");
c.add("I");//1
c.add("T");
System.out.println(c);

Collections.reverse(c);

System.out.println(c);

Collections.sort(c);

System.out.println(c);

int position=Collections.binarySearch(c,"I");
System.out.println("Character found at :"+position);
}

}