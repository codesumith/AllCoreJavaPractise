package com.sumith.aug18mcq;
interface NIT
{
	public void nit();
}

public class FunctionalInterface8 
{
	public static void main(String[] args) {
		String str = "IT";
		NIT n = () -> 
		{
			System.out.println("Naresh" +str);
		};
		n.nit();
	}
}