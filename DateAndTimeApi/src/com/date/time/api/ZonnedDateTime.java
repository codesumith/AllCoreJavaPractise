package com.date.time.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonnedDateTime {
	
	public static void main(String[] args) {
		
		ZonedDateTime z = ZonedDateTime.now();
		System.out.println(z);
		
		
		ZoneId zone =z.getZone();
		System.out.println(zone);
		
		ZoneId.getAvailableZoneIds().forEach( System.out::println);
	}

}
