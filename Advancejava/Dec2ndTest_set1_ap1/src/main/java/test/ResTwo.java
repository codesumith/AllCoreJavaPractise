package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/sub")
@SuppressWarnings("serial")
public class ResTwo extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession hs =req.getSession(false);
		ResBean rb =(ResBean)hs.getAttribute("ResBean");
		rb.setHd(req.getParameter("hd"));
		rb.setYop(Integer.parseInt(req.getParameter("yop")));
		rb.setUniversity(req.getParameter("un"));
		
		RequestDispatcher rd =req.getRequestDispatcher("out.jsp");
		rd.forward(req, res);
	}
}
