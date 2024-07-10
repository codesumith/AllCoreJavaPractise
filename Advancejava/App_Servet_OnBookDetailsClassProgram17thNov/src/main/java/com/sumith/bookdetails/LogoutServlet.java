package com.sumith.bookdetails;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet 
{
	@Override
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
		HttpSession hs =req.getSession();
	if(hs!=null)
	{
		hs.removeAttribute("al");
		hs.removeAttribute("abean");
		hs.invalidate();
		req.setAttribute("msg", "User logout successfully...<br>");	
	}
	else {
		req.setAttribute("msg", "Session Expired...<br>");	
	}
	RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
	rd.forward(req, res);
}
}
