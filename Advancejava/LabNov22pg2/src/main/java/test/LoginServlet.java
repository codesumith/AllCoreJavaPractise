package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String s =new LoginDAO().login(req);
		
		if(s==null) {
			req.setAttribute("msg", "Invalid user");
			
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else {
			req.setAttribute("uname", s);
			RequestDispatcher rd =req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, res);
		}
	}
}
