package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession hs =req.getSession();
		String name =req.getParameter("name");
		String age =req.getParameter("age");
		String mobile=req.getParameter("mobile");
		hs.setAttribute("name", name);
		hs.setAttribute("age", age);
		hs.setAttribute("mobile", mobile);
		RequestDispatcher rd =req.getRequestDispatcher("Second.jsp");
		rd.forward(req, res);
	}

}
