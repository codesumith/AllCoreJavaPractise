package com.sumith.ways_to_load_class_in_jvm;

class Foo
{
	static {
		System.out.println("Static block gets executed");
	}
}

public class ClassNotFoundException {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
          Class.forName("Player");
	}

}
