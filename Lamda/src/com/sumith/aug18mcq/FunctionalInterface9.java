package com.sumith.aug18mcq;

import java.util.function.*;

public class FunctionalInterface9
{
	public static void main(String[] args) {
		Supplier<String> str = () -> String.valueOf(1);
		System.out.println(str.get());
	}
}