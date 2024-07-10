package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		UserBean ub =new UserBean();
		
		ub.setUserName(req.getParameter("uname"));
		ub.setPassword(req.getParameter("pass"));
		ub.setAddress(req.getParameter("add"));
		ub.setMailId(req.getParameter("mid"));
		ub.setPhnNO(Long.parseLong(req.getParameter("phn")));
		ub.setState(req.getParameter("st"));
		ub.setCountry(req.getParameter("ct"));
		
		int k =new RegisterDAO().register(ub);
		
		if(k>0)
		{
			req.setAttribute("msg", "Registered successfully...<br>");
		}
		else {
			req.setAttribute("msg", "Registration failed...<br>");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
		rd.forward(req, res);
	}

}
