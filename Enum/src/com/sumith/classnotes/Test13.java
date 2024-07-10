package com.sumith.classnotes;

enum Movie{
	
	EXTRACTION,XMEN,AVENGERS,MISSIONIMPOSSIBLE;
	
}

public class Test13 {
	
	public static void main(String[] args) {
		
		System.out.println(Test13.getMovie("EXTRACTION"));
		System.out.println(Test13.getMovie(3));
		
	}
	public static Movie getMovie(String s) {
		
		return Enum.valueOf(Movie.class, s.toUpperCase());

	}
	
	public static Movie getMovie(int n) {
		
		return Movie.values()[n];
	}

}
