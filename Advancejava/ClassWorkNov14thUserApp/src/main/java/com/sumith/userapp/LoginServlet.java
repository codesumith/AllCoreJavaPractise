package com.sumith.userapp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		UserBean ub =new LoginDAO().login(req);
		
		if(ub==null)
		{
			req.setAttribute("msg", "Invalid Login");
			
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			Cookie ck=new Cookie("fname",ub.getFirstName());
			
			ServletContext sct =req.getServletContext();
			//Accessing servlet context object
			sct.setAttribute("ubean", ub);
			//Adding Attribute to servlet context
			res.addCookie(ck);
			//adding cookie object to response
			RequestDispatcher rd =req.getRequestDispatcher("Login.jsp");
			rd.forward(req, res);
		}
	}
	
}
