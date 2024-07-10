package com.sumith.static_mcq_aug23;
class Test5 {
		static int x = 10;
		void m1() {
			System.out.println("m1 X : "+x);
		}
		public static void main(String[] args) {
			System.out.println("main X : "+x);	
			//new Test5().m1();
		}
	}