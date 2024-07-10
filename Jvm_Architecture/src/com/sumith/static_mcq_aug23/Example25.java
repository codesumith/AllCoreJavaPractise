package com.sumith.static_mcq_aug23;
class Example25 {
		static int a = 50;

		public static void main(String[] args) {
			int a = 60;

			//a = a;

			System.out.println(a);
			System.out.println(Example25.a); 
		}
	}

/*When you do a = a; within the main method, 
it refers to the local variable a, not the static variable a. 
This line doesn't modify the static variable a at all; i
t only operates on the local variable.*/