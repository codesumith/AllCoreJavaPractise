package com.sumith.calculations;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/cal")
public class CalculationsServlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	
		String s=arg0.getParameter("c");
		System.out.println(s);
		
		if(s.equals("prime"))
		{
			RequestDispatcher rd=arg0.getRequestDispatcher("prime");
			rd.forward(arg0, arg1);
		}
		else if(s.equals("factor"))
		{
			RequestDispatcher rd=arg0.getRequestDispatcher("factor");
			rd.forward(arg0, arg1);
		}
		else if(s.equals("factorial"))
		{
			RequestDispatcher rd=arg0.getRequestDispatcher("factorial");
			rd.forward(arg0, arg1);
		}
		else
		{
			RequestDispatcher rd=arg0.getRequestDispatcher("square");
			rd.forward(arg0, arg1);
		}
		
	}

}
