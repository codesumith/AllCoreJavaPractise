package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewDetailsServlet extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
       RequestDispatcher rd =req.getRequestDispatcher("view.jsp");
       rd.forward(req, res);
	}
}
