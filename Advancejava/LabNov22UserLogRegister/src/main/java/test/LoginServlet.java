package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	UserBean ub =new LoginDAO().log(req);
	
	if(ub==null)
	{
		req.setAttribute("msg", "Invaid User..<br>");
		RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
		rd.forward(req, res);
	}
	else {
		req.setAttribute("fname", ub.getFname());
		HttpSession hs =req.getSession();
		hs.setAttribute("ubean", ub);
		RequestDispatcher rd=req.getRequestDispatcher("out.jsp");
		rd.forward(req, res);
	}
	}

}
