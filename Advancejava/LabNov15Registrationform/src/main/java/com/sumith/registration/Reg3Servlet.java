package com.sumith.registration;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg3")
public class Reg3Servlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		//ServletContext sct = this.getServletContext();
		EmployeeBean eb =(EmployeeBean) this.getServletContext().getAttribute("ebean");
		
		eb.setState(req.getParameter("st"));
		eb.setCountry(req.getParameter("cou"));
		
		if(new RegisterDAO().insert(eb)>0)
		{
		req.getRequestDispatcher("reg4.jsp").forward(req, res);
		}
	}

}
