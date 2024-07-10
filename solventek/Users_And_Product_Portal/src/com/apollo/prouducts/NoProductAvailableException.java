package com.apollo.prouducts;

@SuppressWarnings("serial")
public class NoProductAvailableException extends Exception{
	
	public NoProductAvailableException(String message) {
		System.out.println(message);
	}

}
