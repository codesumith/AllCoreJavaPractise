package com.sumith.url;

import java.io.InputStream;
import java.net.*;

public class URLConnectio {

	public static void main(String[] args) {
		try
		{
			URL url =new URL( "https://codehs.com/student/4245107/section/428273");
			
			//Establishing connection from the specified URL
			URLConnection urlcon =url.openConnection();
			
			InputStream stream =urlcon.getInputStream();
			while(true)
			{
				int i =stream.read();
				if(i==-1)
				{
					break;
				}
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
