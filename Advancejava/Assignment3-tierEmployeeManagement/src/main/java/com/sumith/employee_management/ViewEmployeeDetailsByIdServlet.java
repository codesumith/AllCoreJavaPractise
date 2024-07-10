package com.sumith.employee_management;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/viewById")
public class ViewEmployeeDetailsByIdServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		EmpBean eb =new ViewEmployeeDetailsByIdDAO().retiveById(req.getParameter("eid"));
		
		RequestDispatcher rd =req.getRequestDispatcher("viewById.jsp");
		req.setAttribute("ebobj", eb);
		
		rd.forward(req, res);
		
	}

}
