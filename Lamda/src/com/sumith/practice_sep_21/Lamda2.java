package com.sumith.practice_sep_21;
@FunctionalInterface
interface Calculate
{
	
	void add(int a, int b, double c);
	
}

public class Lamda2 {

	public static void main(String[] args) {
		
Calculate calc= (a, b, c) -> System.out.println("Sum is :"+(a+b+c));

calc.add(12, 12, 14.24);

	}

}
