package com.sumith.labwork31Oct;

import java.util.*;
import java.util.function.Predicate;


public class Pg2 {


	public static void main(String[] args) {
		
		List<Integer> l =new ArrayList<>();
		
		Predicate<List<Integer>> p= x -> x.isEmpty();
		if(p.test(l))
		{
			System.out.println("List is Empty..");
		}
		else
		{
			System.out.println("Not Empty..");
		}
	}

}
