package com.sumith.userapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		RequestDispatcher rd =req.getRequestDispatcher("edit.jsp");
		rd.forward(req, res);
	}
	
	
}
