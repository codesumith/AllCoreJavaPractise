package com.date.time.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo3 {
	
	public static void main(String[] args) {
		ZoneId AusTimeZone = ZoneId.of("Australia/Hobart");
		ZonedDateTime aus = ZonedDateTime.now(AusTimeZone);
		
		System.out.println("Current date and time in aus time zone "+aus);
		
		
		ZoneId EuropeTimeZone = ZoneId.of("Europe/Monaco");
		ZonedDateTime europe = ZonedDateTime.now(EuropeTimeZone);
		System.out.println("Current date and time of europe time zone "+europe);
	}

}
