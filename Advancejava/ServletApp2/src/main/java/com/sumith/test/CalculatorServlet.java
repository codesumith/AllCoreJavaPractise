package com.sumith.test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/calculator")
public class CalculatorServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		String cal =req.getParameter("cal");
		
		if(cal.equals("Add"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Add");
			rd.forward(req, res);
		}
		else if(cal.equals("Sub"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Sub");
			rd.forward(req, res);
		}
		else if(cal.equals("Mul"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Mul");
			rd.forward(req, res);
		}
		else if(cal.equals("Div"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Div");
			rd.forward(req, res);
		}
		else if(cal.equals("Mod"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Mod");
			rd.forward(req, res);
		}
		else if(cal.equals("Highest"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Highest");
			rd.forward(req, res);
		}
		else 
		{
			RequestDispatcher rd =req.getRequestDispatcher("Lowest");
			rd.forward(req, res);
		}
	}

}
