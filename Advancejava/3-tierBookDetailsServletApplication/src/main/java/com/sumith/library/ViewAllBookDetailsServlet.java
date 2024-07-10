package com.sumith.library;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/view")
@SuppressWarnings("serial")
public class ViewAllBookDetailsServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ArrayList<BookBean> al =new ViewAllBookDetailsDAO().retrive();
		
		req.setAttribute("list", al);
		
		RequestDispatcher rd =req.getRequestDispatcher("view.jsp");
		rd.forward(req, res);
	}

}
