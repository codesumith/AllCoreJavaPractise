package com.sumith.labwork31Oct;

import java.util.Scanner;
import java.util.function.Predicate;

public class Pg5 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		String str ="Sumith";
		
		System.out.println("Enter String :");
		String ui =s.next();
		
		Predicate<String> p =x -> x.equals(str) ;
		
		if(p.test(ui))
		{
			System.out.println("Content is same.");
		}
		else
		{
			System.out.println("Content is not same.");
		}
s.close();
	}

}
