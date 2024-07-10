package com.sumith.Practice;

public class Checking_Whether_given_string_is_in_lowercaseornot {
	public static boolean isLowerCase(String phrase) {

		for (int i = phrase.length() - 1; i >= 0; i--) {
			int aschii = (int) phrase.charAt(i);

			if (aschii < 97) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(Checking_Whether_given_string_is_in_lowercaseornot.isLowerCase("CodeHS"));
	}
}
