package com.sumith.networking;

import java.io.*;
import java.net.*;


public class IpAddressHost {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the host name : ");
		String host =br.readLine();
		try
		{
		InetAddress ia =InetAddress.getByName(host);
		System.out.println("Ip address of "+host+" is :"+ia);
		}
		catch(UnknownHostException e)
		{
			System.err.println(e);
		}
	}

}
