package com.sumith.functionalinterface;

import java.util.function.Predicate;

public class CarSearch {

	public static void main(String[] args) {
		
		Car c1 =new Car("Hundai",25000,35000);
		Car c2 =new Car("Tata",45000,65000);
		
		Predicate<Car> p = x ->
		{
			if(x.getPrice()>=10000&&x.getPrice()<=30000&&x.getMileage()<50000)
			{
				return true;
			}
			else
				return false;
		};

		if(p.test(c2))
			System.out.println(c1);
		else
			System.out.println("Your car is not for sale.");
		
	}

}
