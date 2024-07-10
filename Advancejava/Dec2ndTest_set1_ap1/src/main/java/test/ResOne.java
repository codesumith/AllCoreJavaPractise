package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/con")
@SuppressWarnings("serial")
public class ResOne extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		ResBean rb = new ResBean();
		rb.setName(req.getParameter("nm"));
		rb.setAge(Integer.parseInt(req.getParameter("age")));
		rb.setMobile(Long.parseLong(req.getParameter("mb")));
		
		HttpSession hs = req.getSession();
		hs.setAttribute("ResBean", rb);
		
		RequestDispatcher rd =req.getRequestDispatcher("two.html");
		rd.forward(req, res);
	}
	
}
