package com.sumith.string_and_its_method_related_pg;

import java.util.function.Predicate;

public class EqualsMethod {

	public static void main(String[] args) {
		
		Predicate<String> p1 =name-> name.equals("Sumith");
		
		System.out.println("Are you sumith : "+p1.test("Sumith"));

	}

}
