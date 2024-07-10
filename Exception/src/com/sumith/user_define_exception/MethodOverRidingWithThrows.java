package com.sumith.user_define_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base{
	public void show() throws IOException
	{
		System.out.println("Super class method");
	}
}


class Derived extends Base {
	public void show() throws FileNotFoundException {
		System.out.println("Sub class method");
	}
}
public class MethodOverRidingWithThrows {

	public static void main(String[] args) {
		

	}

}
