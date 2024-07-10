package com.sumith.userlogin_registration;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		UserBean ub =new UserBean();
		
		ub.setUserName(req.getParameter("uname"));
		ub.setPassword(req.getParameter("pass"));
		
		boolean check =new LoginDAO().checkCredentials(ub);
		
		if(check)
		{
			RequestDispatcher rd =req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd =req.getRequestDispatcher("erlogin.jsp");
			rd.forward(req, res);
		}
	}

}
