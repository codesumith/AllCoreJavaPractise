package com.sumith.time.greetings;

import java.io.*;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
public class WishMessageServlet  extends HttpServlet
{

	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
			
		PrintWriter pw =res.getWriter();
		
		res.setContentType("text/html");
		
		pw.close();
	}
	
}
