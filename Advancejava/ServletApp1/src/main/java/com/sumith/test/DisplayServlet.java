package com.sumith.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/dis")

public class DisplayServlet extends GenericServlet 
{
	@Override
public void init() throws ServletException
{
	//No Code
}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw =res.getWriter();
		
		res.setContentType("text/html");
		
		String uName = req.getParameter("uname");
		String mId = req.getParameter("mid");
		Long phNo = Long.parseLong(req.getParameter("phno"));
		

		
		pw.println("****UserDetaisl****");
		pw.println("<br>UserName :"+uName);
		pw.println("<br>MailId :"+mId);
		pw.println("<br>PhoneNo :"+phNo);
	}
	
	@Override
	public void destroy()
	{
		//No Code
	}
}
