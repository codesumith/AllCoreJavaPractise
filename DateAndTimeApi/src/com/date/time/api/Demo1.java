package com.date.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo1 {
	
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t =LocalTime.now().withNano(0);
		System.out.println(t);
		
		LocalDateTime dt =LocalDateTime.now();
		System.out.println(dt);
	}

}
