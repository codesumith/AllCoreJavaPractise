package com.sumith.registraton;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/one")
public class Reg1 extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
     
		EmployeeBean eb =new EmployeeBean();
		
		eb.setName(arg0.getParameter("name"));
		eb.setAge(Integer.parseInt(arg0.getParameter("age")));
		eb.setMobile(arg0.getParameter("mb"));
		
		System.out.println(eb.getName());
		
		ServletContext sct =getServletContext();
		sct.setAttribute("ebean",eb );
		//getServletContext().setAttribute("ebean",eb );
		
		RequestDispatcher rd =arg0.getRequestDispatcher("two.jsp");
		rd.forward(arg0, arg1);
		
	}

}
