package com.sumith.aug18mcq;
//@FunctionalInterface
interface Str
{
	int methodStr(String str);
}
public class FunctionalInterface4 {
	public static void main(String[] args) {
		Str str = (String s) -> 2;
		System.out.println(str.methodStr("2"));
	}
}