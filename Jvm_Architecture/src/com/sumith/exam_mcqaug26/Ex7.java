package com.sumith.exam_mcqaug26;

class Right {
	int a;
	{
		a = 010;//8
	}
}

public class Ex7 {
	static Right r;//null
	static {
		r = new Right();//object
		System.out.println(r.a);//8
	}

	Ex7() {
		//this.r.a = r.a + 10;
		//System.out.println(this.r.a);//18
	}

	public static void main(String[] args) {
		//Ex7 w = new Ex7();
		//System.out.println(w.r.a);//18
		System.out.println(Ex7.r.a);//18
	}
}
