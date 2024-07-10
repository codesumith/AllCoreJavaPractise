package com.sumith.userlogin_registration;
import java.io.IOException;


import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdatePasswordServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		UserBean ub =new UserBean();
		
		ub.setPhNo(req.getParameter("phnNo"));
		ub.setPassword(req.getParameter("newpass"));
		
		int k=new UpdatePasswordDAO().update(ub);
		
		if(k>0)
		{
			RequestDispatcher rd =req.getRequestDispatcher("update.jsp");
			rd.forward(req, res);
				
		}
		else
		{
			RequestDispatcher rd =req.getRequestDispatcher("erupdate.jsp");
			rd.forward(req, res);
		}
		

	}

}
