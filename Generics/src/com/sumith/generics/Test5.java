package com.sumith.generics;
import java.util.*;

class Car
{
	
}

public class Test5 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		ArrayList<Car> a =new ArrayList<>();
		a.add(new Car());
		a.add(new Car());
		a.add(new Car());
		
		ArrayList b= a;// assigning Generic to raw type
		
		System.out.println(b);

	}

}
