package com.sumith.mcq28arrays;

public class Ex16 {
	public static void main(String[] args) {
		Object obj = new int[] { 1, 2, 3 }; // line 12
		int[] someArray = (int[]) obj; // line 13
		for (int i : someArray)
			System.out.print(i + " "); // line 14

	}
}