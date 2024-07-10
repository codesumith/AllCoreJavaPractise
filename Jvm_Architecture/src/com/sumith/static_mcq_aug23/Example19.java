package com.sumith.static_mcq_aug23;

public class Example19 {
		static {
			int x = 10;
			Example19.x = x+x;
		}

		static int x;
		
		public static void main(String[] args) {
			System.out.println("Class Level X : "+Example19.x);
		}

		static {
			x = x+Example19.x;
		}
	}