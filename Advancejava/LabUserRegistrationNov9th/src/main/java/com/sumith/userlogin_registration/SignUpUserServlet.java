package com.sumith.userlogin_registration;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/signup")
public class SignUpUserServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		UserBean ub =new UserBean();
		
		ub.setUserName(req.getParameter("uname"));
		ub.setPassword(req.getParameter("password"));
		ub.setFirstName(req.getParameter("fname"));
		ub.setLastName(req.getParameter("lname"));
		ub.setAddress(req.getParameter("add"));
		ub.setMailId(req.getParameter("mid"));
		ub.setPhNo(req.getParameter("phn"));
		
		int k =new SignUpUserDAO().insert(ub);
		
		if(k>0)
		{
			RequestDispatcher rd =req.getRequestDispatcher("signup.jsp");
			rd.forward(req, res);
		}
		
		

	}

}
