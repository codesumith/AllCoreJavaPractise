package com.sumith.calculations;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/square")
public class Square extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int num =Integer.parseInt(req.getParameter("number"));
		PrintWriter pw =res.getWriter();
		
		int s=num*num;
		
		
		pw.println(num+" square is :"+s);
	}

}

