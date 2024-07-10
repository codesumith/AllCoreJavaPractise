package com.sumith.aug22_static_block_mcq;

	
	class Test15Super {
		int x =10;
		static void m1() {
			System.out.println("Test15Super : m1()");//4
		}
		static {
			System.out.println("Test15Super : SB1 called");//1
		}
	}
	public class Test15Sub extends Test15Super {
		static int x =20;//2
		static {
			System.out.println("Test15Sub : SB1 called");//3
		}
		static void m2(){
			m1();
			System.out.println("Test15Sub : m2()");//5
		}
		public static void main(String[] args) {
			m2();
		}
	}



