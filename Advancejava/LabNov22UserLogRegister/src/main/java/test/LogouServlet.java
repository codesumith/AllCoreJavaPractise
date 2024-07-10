package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogouServlet extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	HttpSession hs =req.getSession(false);
	if(hs==null)
	{
		req.setAttribute("msg", "SessionExpired...<br>");
		
	}
	else {
	hs.removeAttribute("ubean");
	hs.removeAttribute("fname");
	hs.invalidate();
	
	req.setAttribute("msg", "Logout Successfull...<br>");
	}
	
	RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
    rd.forward(req, res);
	}
}
