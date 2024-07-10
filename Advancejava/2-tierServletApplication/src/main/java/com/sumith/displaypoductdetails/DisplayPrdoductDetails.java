package com.sumith.displaypoductdetails;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/prod")
public class DisplayPrdoductDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		RequestDispatcher rd =req.getRequestDispatcher("product.jsp");
		rd.forward(req, res);
		
	}

}
