package com.sumith.register_viewid;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewByIdServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		Employee e =new ViewByIdDAO().retrive(req.getParameter("id"));
		
		RequestDispatcher rd =req.getRequestDispatcher("view.jsp");
		req.setAttribute("empdetails", e);
		rd.forward(req, res);
		
	}

}
