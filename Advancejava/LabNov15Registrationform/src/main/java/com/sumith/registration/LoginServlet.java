package com.sumith.registration;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		EmployeeBean eb =new EmployeeBean();
		
		eb.setEmpName(req.getParameter("epn"));
		eb.setId(req.getParameter("epid"));
	
		PrintWriter pw =res.getWriter();
		
		String s =new LoginDAO().check(eb);
		
		if(s!=null)
		{
			pw.print("Login success..");
			pw.print("welcome to nothing "+s);
		}
		else
		{
			pw.print("User not found..");
		}
		
	}

}
