package com.sumith.calculations;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/prime")
public class prime extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int num =Integer.parseInt(req.getParameter("number"));
		PrintWriter pw =res.getWriter();
		
		boolean b= true;
		
		if(num==1&&num==0)
		{
			b=false;
		}
		else {
		for(int i=2;i<num-1;i++)
		{
			if(num%2==0)
			{
				b=false;
			}
		}
		}
		
		if(b)
		{
			pw.print(num+"is prime");
		}
		else
			pw.print(num+"is not prime");
	}

}
