package com.sumith.empreg;
import java.io.*;

import javax.servlet.*;

import javax.servlet.annotation.*;



@SuppressWarnings("serial")
@WebServlet("/reg2")
public class Reg2Servlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ServletContext sct = this.getServletContext();
		EmployeeBean eb =(EmployeeBean) sct.getAttribute("ebean");
		
		eb.setLname(req.getParameter("lname"));
		eb.setMid(req.getParameter("mid"));
		eb.setPhn(req.getParameter("phn"));
		
		
		
		RequestDispatcher rd =req.getRequestDispatcher("reg3.jsp");
		rd.forward(req, res);
		
	}

	

}
