package com.sumith.bookdetails;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditBookDetailServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession hs =req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd =req.getRequestDispatcher("editbook.jsp");
			rd.forward(req, res);
		}
	}

}
