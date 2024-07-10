package com.sumith.registraton;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/two")
public class Reg2 extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		ServletContext sct =this.getServletContext();
		EmployeeBean eb=(EmployeeBean)sct.getAttribute("ebean");
		
		
		eb.setDegree(arg0.getParameter("hd"));
		eb.setYop(arg0.getParameter("yop"));
		eb.setUniversity(arg0.getParameter("uni"));
	
		System.out.println(eb.getYop());
		
		
		RequestDispatcher rd =arg0.getRequestDispatcher("out.jsp");
		rd.forward(arg0, arg1);
		
	}

}
