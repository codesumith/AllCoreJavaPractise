package com.sumith.oct20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pg09 {

	public static void main(String[] args) {
		
		
		Scanner s =new Scanner(System.in);
		
Map<Integer,String> m1= new HashMap<>();
		
		m1.put(1,"Red");
		m1.put(2, "Green");
		m1.put(3, "Black");
		
		System.out.println("Enter key You Want to Search :");
		int k =s.nextInt();
		
		
		if(m1.containsKey(k))
		{
			System.out.println("Contains :"+k);
		}
		else
		{
			System.out.println("Not contains");
		}

		s.close();
	}

}
