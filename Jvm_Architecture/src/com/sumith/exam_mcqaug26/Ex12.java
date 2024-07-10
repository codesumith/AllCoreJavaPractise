package com.sumith.exam_mcqaug26;

public class Ex12 {
	//private Object o;

	private void doSomethingElse(Object obj) {
		//o = obj;
	}

	public void doSomething() {
		Object o = new Object();
		doSomethingElse(o);
		o = new Object();
		doSomethingElse(null);
		o = null;
	}
}