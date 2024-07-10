package com.sumith.employee_management;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/viewAll")
public class ViewAllEmployeeDetailsServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ArrayList<EmpBean> al =new  ViewAllEmployeeDetailsDAO().retrive();
		
		RequestDispatcher rd=req.getRequestDispatcher("ViewAllEmployeeDetails.jsp");
		req.setAttribute("list", al);
		rd.forward(req, res);
		
	}

}
