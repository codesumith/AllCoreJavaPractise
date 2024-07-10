package com.sumith.url;

import java.net.*;

public class URLinfo {

	public static void main(String[] args) {
		
		try
		{
			URL url =new URL("https://login.oracle.com/mysso/signon.jsp");
			System.out.println("Protocol :"+url.getProtocol());
			System.out.println("Host name :"+url.getHost());
			System.out.println("Port Number :"+url.getPort());
			System.out.println("File name :"+url.getFile());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
