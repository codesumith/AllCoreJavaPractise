package com.sumith.networking;

import java.net.*;

public class AddressOfLocalMachine {

	public static void main(String[] args) throws UnknownHostException{
		
		InetAddress ia =InetAddress.getLocalHost();
		String addr =ia.getHostAddress();
		String name=ia.getHostName();
		System.out.println("My host name is :"+name+"\nMy address is :"+addr);

	}

}
