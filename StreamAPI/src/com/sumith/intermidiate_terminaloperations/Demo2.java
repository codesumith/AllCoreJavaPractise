package com.sumith.intermidiate_terminaloperations;
//import java.util.*;
import java.util.stream.*;
public class Demo2 {
public static void main(String[] args) {
	Stream<Integer> stream =Stream.of(1,2,3,4,5,6,7,8,9);
	stream.forEach(p -> System.out.println(p));
	
	System.out.println("==================================");
	
	Stream<Integer> strm = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
	strm.forEach(p -> System.out.println(p));
	
}

}