package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ControllerServlet extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		ServletConfig scf =this.getServletConfig();
		String servNameString=scf.getServletName();
		req.setAttribute("servName", servNameString);
		req.setAttribute("cvalue", scf.getInitParameter("b"));
		req.getRequestDispatcher("Display.jsp").forward(req, res);
	}
	
}
