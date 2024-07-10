package com.sumith.sep12_lab_pg;

public class Covert_all_String_into_upper_case {

	public static void main(String[] args) {

		String small = "sumith";
		String capital = "";
		System.out.println(small);

		char ch;

		for (int i = 0; i < small.length(); i++) {

			ch = small.charAt(i);

			if (ch >= 90) {

				ch = (char) (ch - 32);
				capital += ch;

			} else {

				capital += ch;
			}
		}

		System.out.println("In upper case : "+capital);
	}

}
