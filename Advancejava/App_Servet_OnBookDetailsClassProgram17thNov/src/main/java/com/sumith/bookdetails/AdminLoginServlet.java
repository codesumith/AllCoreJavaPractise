package com.sumith.bookdetails;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/alog")
public class AdminLoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		AdminBean ab =new AdminLoginDAO().login(req);
		
		if(ab==null)
		{
			req.setAttribute("msg", "Invalid User<br>");
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			HttpSession hs=req.getSession();
			//new session created
			hs.setAttribute("abean", ab);
			//adding AdminBean to Session
			RequestDispatcher rd =req.getRequestDispatcher("AdminLogin.jsp");
			rd.forward(req, res);
		}
	}

}
