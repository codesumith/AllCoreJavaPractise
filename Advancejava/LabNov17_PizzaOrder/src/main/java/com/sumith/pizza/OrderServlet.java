package com.sumith.pizza;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/order")
public class OrderServlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		RequestDispatcher rd=arg0.getRequestDispatcher("order.jsp");
		rd.forward(arg0, arg1);
		
		
	}

}
