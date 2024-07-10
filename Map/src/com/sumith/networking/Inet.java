package com.sumith.networking;

import java.net.*;

public class Inet {

	public static void main(String[] args) throws UnknownHostException{
		
		InetAddress ia =InetAddress.getLocalHost();
		System.out.println("Local name and Ip address : "+ia);
	}
}
