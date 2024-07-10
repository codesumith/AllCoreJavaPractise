package com.sumith.lab_work_sep13;



public class Test13 {
	public static void main(String[] args) {
		String s = new String("naresh it solutions");
		String[] st = s.split("");
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i] + "");
		}
		
	}
}