package com.sumith.userapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		UserBean ub =new UserBean();//bean object
		
		System.out.println(req);
		ub.setUserName(req.getParameter("uname"));
		ub.setPassword(req.getParameter("pword"));
		ub.setFirstName(req.getParameter("fname"));
		ub.setLastName(req.getParameter("lname"));
		ub.setAddress(req.getParameter("add"));
		ub.setMailId(req.getParameter("mid"));
		ub.setPhone(req.getParameter("phn"));
		
		if(new RegisterDAO().register(ub)>0)
		{
			req.setAttribute("msg", "User register successfully..");
			RequestDispatcher rd =req.getRequestDispatcher("register.jsp");
			rd.forward(req, res);
		}
	}
	
}
