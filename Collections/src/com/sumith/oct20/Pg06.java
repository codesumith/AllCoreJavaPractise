package com.sumith.oct20;


import java.util.NavigableSet;
import java.util.TreeSet;

public class Pg06 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> tr=new TreeSet<>();
		tr.add(1);
		tr.add(5);
		tr.add(6);
		tr.add(7);
		tr.add(8);
		
	System.out.println(tr.headSet(7));
	    



}
}
