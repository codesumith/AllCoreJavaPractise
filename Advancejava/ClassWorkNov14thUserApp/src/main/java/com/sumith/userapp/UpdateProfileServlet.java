package com.sumith.userapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		ServletContext sct =req.getServletContext();
		UserBean ub =(UserBean)sct.getAttribute("ubean");
		
		
		ub.setAddress(req.getParameter("add"));
		
		ub.setMailId(req.getParameter("mid"));
		
		ub.setPhone(req.getParameter("phn"));
		
		if(new UpdateProfileDAO().updateProfile(ub)>0)
		{
			RequestDispatcher rd =req.getRequestDispatcher("Update.jsp");
			rd.forward(req, res);
		}
		
	}
	
}
