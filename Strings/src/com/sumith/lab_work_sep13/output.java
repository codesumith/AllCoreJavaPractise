package com.sumith.lab_work_sep13;

class output {
	public static void main(String args[]) {
		String c = "Hello i love java";
		int start = 2;
		int end = 9;
		char s[] = new char[end - start];
		c.getChars(start, end, s, 0);
		System.out.println(s);
	}
}