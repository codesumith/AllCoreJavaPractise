package com.sumith.empreg;
import java.io.*;

import javax.servlet.*;

import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		PrintWriter pw =res.getWriter();
		String s=new LoginDAO().login(req);
		
		if(s==null)
		{
		pw.print("Invalid user");
		}
		else
		{
			pw.print("Welcome to :"+s);
		}
		
	}

}
