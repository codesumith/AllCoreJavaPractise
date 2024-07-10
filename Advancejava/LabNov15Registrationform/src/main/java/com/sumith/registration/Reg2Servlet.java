package com.sumith.registration;
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
		
		eb.setlName(req.getParameter("ln"));
		eb.setMail(req.getParameter("mid"));
		eb.setPhno(req.getParameter("phn"));
		
		
		req.getRequestDispatcher("reg3.jsp").forward(req, res);
	}

}
