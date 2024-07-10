package com.sumith.empreg;

import java.io.*;

import javax.servlet.*;

import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg1")
public class Reg1Servlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		EmployeeBean eb =new EmployeeBean();
		
		eb.setEname(req.getParameter("ename"));
		eb.setEid(req.getParameter("eid"));
		eb.setFname(req.getParameter("fname"));
		
		getServletContext().setAttribute("ebean", eb);
		
		RequestDispatcher rd =req.getRequestDispatcher("reg2.jsp");
		rd.forward(req, res);
		
	}

	

}
