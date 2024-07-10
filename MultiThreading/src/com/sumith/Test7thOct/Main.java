package com.sumith.Test7thOct;

class Printer {
	int paperCount;
	
	public void printDocument(String document)
	{
		System.out.println("Printing Document in synchronized way");
	}
}

class User extends Thread{
	
	String name;
	Printer printer;
	
	public void run()
	{
	new Printer().printDocument(name);
	}
}

public class Main {

	public static void main(String[] args) {
		
		User u=new User();
		u.start();

	}

}
