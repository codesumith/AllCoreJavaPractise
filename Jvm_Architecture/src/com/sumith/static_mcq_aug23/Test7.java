package com.sumith.static_mcq_aug23;
class Test7 {
		//static variable a
		static int a = 20;
		{
			System.out.println(a);
			
		}
		static {
			System.out.println(a);
		}
		Test7(){
			System.out.println(a);
		}
		public static void main(String[] args) {
			//write code here to access a variable with diff ways
			System.out.println(a);
			System.out.println(Test7.a);
			
			//Test7 t7=new Test7();
			//System.out.println(t7.a);
		}
	}