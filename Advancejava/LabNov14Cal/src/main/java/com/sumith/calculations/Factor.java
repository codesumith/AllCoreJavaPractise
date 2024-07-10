package com.sumith.calculations;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/factor")
public class Factor extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int num =Integer.parseInt(req.getParameter("number"));
		PrintWriter pw =res.getWriter();
		
		String s="";
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				s+=i;
				s+=" ";
			}
		}
		
		pw.println(num+" factor is :"+s);
	}

}
