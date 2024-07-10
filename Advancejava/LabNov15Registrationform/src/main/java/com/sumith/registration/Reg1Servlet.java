package com.sumith.registration;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg1")
public class Reg1Servlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		EmployeeBean eb =new EmployeeBean();
		
		eb.setEmpName(req.getParameter("en"));
		eb.setId(req.getParameter("eid"));
		eb.setfName(req.getParameter("efn"));
		
		getServletContext().setAttribute("ebean", eb);
		
		req.getRequestDispatcher("reg2.jsp").forward(req, res);
	}

}
