package com.sumith.userlogin_registration;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteUserServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
	UserBean ub = new UserBean();
	
	ub.setPhNo(req.getParameter("phnNo"));
	
	if(new DeleteUserDAO().deleteAccount(ub)>0)
	{
		RequestDispatcher rd =req.getRequestDispatcher("delete.jsp");
		rd.forward(req, res);
	}
	else
	{
		RequestDispatcher rd =req.getRequestDispatcher("erdelete.jsp");
		rd.forward(req, res);
	}
		
	}

}
