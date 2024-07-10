package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	HttpSession hs =req.getSession(false);
	if(hs==null)
	{
		req.setAttribute("msg", "SessionExpired...<br>");
		
	}
	else {
		UserBean ub =(UserBean)hs.getAttribute("ubean");
		ub.setPass(req.getParameter("pass"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setAdd(req.getParameter("add"));
		
		new UpdateDetailsDAO().update(ub);
		
		req.setAttribute("msg", "UpdatedSuccesfully...<br>ReLogin To Reflect Details<bt>");
		
	}
	RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
    rd.forward(req, res);
	}
}