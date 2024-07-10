package com.sumith.exam_mcqaug26;

public class Ex10 {
	 int squares = 81;

	public static void main(String[] args) {
		Ex10 b=new Ex10();b.go();
		
	}

	void go() {
		
		incr(++squares);
		System.out.println(squares);
	}

	void incr(int squares) { squares += 10;}
}