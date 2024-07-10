package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/viewall")
public class ViewServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException
	{
		ArrayList<UserBean> al =new ViewDAO().viewAll();
		
		if(al==null)
		{
			req.setAttribute("msg", "Invalid Process...<br>");
			
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else {
			req.setAttribute("al", al);
			RequestDispatcher rd =req.getRequestDispatcher("success.jsp");
			rd.forward(req, res);
		}
	}
}
