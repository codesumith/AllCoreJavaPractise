package com.sumith.static_mcq_aug23;
class Test15Super 
{
		int x =10;
		static void m1() {
			System.out.println("Test15Super : m1()");
		}
		static {
			System.out.println("Test15Super : SB1 called");
		}
	}
	public class Test15Sub extends Test15Super {
		static int x =20;
		static {
			System.out.println("Test15Sub : SB1 called");
		}
		static void m2(){
			m1();
			System.out.println("Test15Sub : m2()");
		}
		public static void main(String[] args) {
			m2();
		}
	}