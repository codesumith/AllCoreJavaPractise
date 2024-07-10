package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException
	{
		
		RequestDispatcher rd =req.getRequestDispatcher("out.jsp");
		rd.forward(req, res);
	}

}