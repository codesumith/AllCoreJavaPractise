package com.sumith.aug22_static_block_mcq;

class Test10 {
		
	    static{
			System.out.println("SB1");
		}
		static void m1() {
			System.out.println("m1()");
		}
		public static void main(String []args) {
			Test10.m1();
		}
	}