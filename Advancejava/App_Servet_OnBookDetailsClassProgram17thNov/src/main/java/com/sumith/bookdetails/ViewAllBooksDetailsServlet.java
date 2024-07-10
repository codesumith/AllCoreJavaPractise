package com.sumith.bookdetails;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllBooksDetailsServlet extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession hs =req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expred...<br>");
			
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else {
	ArrayList<BookBean> al =new ViewAllBookDetailsDAO().Retrieve();
	
	hs.setAttribute("al", al);
	
	RequestDispatcher rd =req.getRequestDispatcher("viewbooks.jsp");
	rd.forward(req, res);
		}
	
	}
	
}
