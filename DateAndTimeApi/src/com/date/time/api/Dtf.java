package com.date.time.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dtf{
	
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("d--YYYY HH:MM:ss");
		
		String formattedDateTime = now.format(formater);
		System.out.println(formattedDateTime);
		
		
	}

}
