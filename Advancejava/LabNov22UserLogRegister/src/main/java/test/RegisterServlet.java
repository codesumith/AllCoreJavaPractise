package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		UserBean ub = new UserBean();
		ub.setUname(req.getParameter("uname"));
		ub.setPass(req.getParameter("pass"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setAdd(req.getParameter("add"));
		
		int k=new RegisterDAO().register(ub);
		if(k>0)
		{
			req.setAttribute("msg","Registered Succesfully...<br>");
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
	}
	
}
