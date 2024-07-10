package com.sumith.exception_handling_mcq_sep7;

class Person {
	public void talk() {

	}
}

public class Test {
	public static void main(String[] args) {
		//Person p = null;
		try {
			//p.talk();
		} catch (NullPointerException e) {
			System.out.println("There is NullPointerException");
		} catch (Exception e) {
			System.out.println("There is Exception");
		}
		System.out.println("Everything went fine");
	}

}