package com.sumith.userapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		Cookie[] cookies = req.getCookies();
		//Getting Cookies from request object
		if(cookies==null)
		{
		 req.setAttribute("msg", "Session Expired");
		 RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
		 rd.forward(req, res);
		}
		else
		{
			String fName =cookies[0].getValue();
			System.out.println(fName);
			req.setAttribute("fName", fName);
			RequestDispatcher rd =req.getRequestDispatcher("view.jsp");
			rd.forward(req, res);
		}
	}
	
}
