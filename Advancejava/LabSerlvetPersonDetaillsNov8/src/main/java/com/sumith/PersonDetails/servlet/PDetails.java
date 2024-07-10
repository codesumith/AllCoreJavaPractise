package com.sumith.PersonDetails.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/person")
@SuppressWarnings("serial")
public class PDetails extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		RequestDispatcher rd =req.getRequestDispatcher("person.jsp");
		rd.forward(req, res);
		
	}
	
}
