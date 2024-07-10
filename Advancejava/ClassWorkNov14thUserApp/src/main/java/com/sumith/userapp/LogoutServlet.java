package com.sumith.userapp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	Cookie[] cookies = req.getCookies();
	if(cookies==null)
	{
		req.setAttribute("msg", "Session Expired");
	}
	else
	{
		ServletContext sct =req.getServletContext();
		//Accessing ServletContext object
		sct.removeAttribute("ubean");
		cookies[0].setMaxAge(0);
		res.addCookie(cookies[0]);
		req.setAttribute("msg", "User Logged Out Succesfully..<br>" );
	}
	RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
	rd.forward(req, res);
}
}
