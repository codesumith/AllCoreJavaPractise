package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/log")
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	BABean bb= new LoginDAO().login(req);
	
	if(bb!=null) {
		
		HttpSession hs =req.getSession();
		hs.setAttribute("BABean", bb);
		
		ServletContext sc =req.getServletContext();
		sc.setAttribute("acn", bb.getAn());
		
		RequestDispatcher rd =req.getRequestDispatcher("LoginSuccess.jsp");
		rd.forward(req, res);
	}
	else {
	 req.setAttribute("msg", "Invalid user");
	 
	 RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
		rd.forward(req, res);
	 
	}
	}
}
