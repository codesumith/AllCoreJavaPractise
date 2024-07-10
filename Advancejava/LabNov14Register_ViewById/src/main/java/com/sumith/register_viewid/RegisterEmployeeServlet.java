package com.sumith.register_viewid;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterEmployeeServlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		Employee e =new Employee();
		
		e.setId(arg0.getParameter("id"));
		e.setName(arg0.getParameter("ename"));
		e.setSalary(Double.parseDouble(arg0.getParameter("esal")));
		e.setAddress(arg0.getParameter("add"));
		
		int k =new EmployeeRegistrationDAO().insert(e);
		
		if(k>0)
		{
			RequestDispatcher rd =arg0.getRequestDispatcher("reg.jsp");
			rd.forward(arg0, arg1);
		}
		else
		{
			PrintWriter pw =arg1.getWriter();
			
			pw.print("Failed to Register");
		}
	}

}
