package com.sumith.employee_management;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddEmployeeDetailsServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		EmpBean eb =new EmpBean();
		
		eb.setId(req.getParameter("eid"));
		eb.setName(req.getParameter("ename"));
		eb.setDesg(req.getParameter("edesg"));
		eb.setBsal(Float.parseFloat(req.getParameter("esal")));
		eb.setTsal(Float.parseFloat(req.getParameter("esal")));
		
		int k =new AddEmployeeDetailsDAO().insert(eb);
		
		if(k>0)
		{
			RequestDispatcher rd =req.getRequestDispatcher("AddEmp.jsp");
			rd.forward(req, res);
		}
		
	}

}
