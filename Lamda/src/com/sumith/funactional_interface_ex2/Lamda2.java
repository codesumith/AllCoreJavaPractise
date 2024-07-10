package com.sumith.funactional_interface_ex2;

public class Lamda2{

	public static void main(String[] args) {
		
Calculate calc= (a,b,c) -> System.out.println("sum is:"+(a+b+c));

calc.add(12, 12, 14.24);

	}

}
