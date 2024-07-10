package com.sealed_classes;

sealed class Alpha permits Beta,Gamma {
public void m1()
{
	System.out.println("M1 method..");
}
	
}
non-sealed class Beta extends Alpha
{
	
}
final class Gamma extends Alpha
{
	
}


public class SealedDemo1
{

	public static void main(String[] args) {
		Beta b = new Beta();
		b.m1();
		Gamma g = new Gamma();
		g.m1();
	}
}