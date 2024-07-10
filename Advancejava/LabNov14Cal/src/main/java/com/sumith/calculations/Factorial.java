package com.sumith.calculations;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/factorial")
public class Factorial extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int num =Integer.parseInt(req.getParameter("number"));
		PrintWriter pw =res.getWriter();
		
		int f=1;
		
		for(int i=1;i<=num;i++)
		{
			
				f=f*i;
			
		}
		
		pw.println(num+" factorial is :"+f);
	}

}
