package com.sealed_classes;



abstract sealed class Online permits Laptop,Mobile
{
	public abstract void joinClass();
}

non-sealed class Laptop extends Online
{

	@Override
	public void joinClass() {
		
System.out.println("Joining class through Laptop");
		
	}
	
}

final class Mobile extends Online
{

	@Override
	public void joinClass() {
		
System.out.println("Joining class through Laptop");
		
	}
	
}


public class SealedDemo2 {
	
	public static void main(String[] args) {
		Laptop l =new Laptop(); l.joinClass();
		Mobile m =new Mobile(); m.joinClass();
	}

}
