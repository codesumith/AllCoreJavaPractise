package com.sumith.secondhandcar;

import java.util.function.*;

public class Searchcar {

	public static void main(String[] args) {
		
		
		        Predicate<Car> carPredicate = car -> car.getPrice() >= 100000 && car.getPrice() <= 300000
		                && car.getMileage() < 50000;

		        Car c = new Car("Hundai", 350000, 38000);
		       

		        if (carPredicate.test(c)) { 
		            System.out.println("Car details:\n" + c);
		        } else {
		            System.out.println("Your car is not for sale");
		        }

		        
		    }
		}

