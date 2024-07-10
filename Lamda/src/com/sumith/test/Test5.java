package com.sumith.test;

import java.util.function.*;

public class Test5 {

	public static void main(String[] args) {
		
Consumer<Integer> printInt = x -> System.out.println(x);
printInt.accept(12);
	
Predicate<Integer> Int  =  x->{
	 if(x==4) {
		 return true;
	 }
	 else {
		 return false;
	 }
};

System.out.println(Int.test(5));
		
	}

}
