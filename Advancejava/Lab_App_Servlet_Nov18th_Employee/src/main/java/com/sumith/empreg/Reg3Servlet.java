package com.sumith.empreg;
import java.io.*;

import javax.servlet.*;

import javax.servlet.annotation.*;



@SuppressWarnings("serial")
@WebServlet("/reg3")
public class Reg3Servlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		EmployeeBean eb =(EmployeeBean) this.getServletContext().getAttribute("ebean");
		
		eb.setState(req.getParameter("st"));
		eb.setCountry(req.getParameter("ct"));
		
		if(new RegistrationDAO().register(eb)>0)
		{
			RequestDispatcher rd =req.getRequestDispatcher("reg4.jsp");
			rd.forward(req, res);
		}
		
		
		
		
	}

	

}
