package com.sumith.lamda_consumer_interface;

import java.util.function.*;

public class Lamda7 {

	public static void main(String[] args) {
		

		Consumer<Integer> printInt =(x) ->System.out.println(x);
		printInt.accept(2);
		
		Consumer<String> printString =(x) ->System.out.println(x);
		printString.accept("Hi");
		
		Consumer<Double> printdou = x-> System.out.println("X vlaue is : "+x);
		printdou.accept(39.98);
		
		Consumer<Boolean> printBoo = x -> System.out.println(x);
		printBoo.accept(true);
		
		Consumer <Character> printChar =x -> System.out.println(x);
		printChar.accept('A');
		
		Consumer<Student> printStudent= x -> System.out.println(x);
		printStudent.accept(new Student());
	
	}

}
