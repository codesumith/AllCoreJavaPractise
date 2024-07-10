package com.sumith.calculator;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/calcu")
public class CalculatorServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		String cal=req.getParameter("cal");
		
		if(cal.equals("Add"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("Add.jsp");
			rd.forward(req, res);
		}
		else if(cal.equals("Sub"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("Sub.jsp");
			rd.forward(req, res);
		}
		else if(cal.equals("Mul"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("Mul.jsp");
			rd.forward(req, res);
		}
		else if(cal.equals("Div"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Div.jsp");
			rd.forward(req, res);
		}
		else if(cal.equals("Mod"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Mod.jsp");
			rd.forward(req, res);
		}
		else if(cal.equals("Highest"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("Highest.jsp");
			rd.forward(req, res);
		}
		else 
		{
			RequestDispatcher rd =req.getRequestDispatcher("Lowest.jsp");
			rd.forward(req, res);
		}
	}

	

}
