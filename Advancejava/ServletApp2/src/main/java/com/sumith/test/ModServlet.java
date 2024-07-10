package com.sumith.test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/Mod")
public class ModServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
PrintWriter pw =res.getWriter();
		
		res.setContentType("text/html");
		
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		int Mod=v1%v2;
		
		pw.print("<p style='font-size: 24px;'>Modulus :"+Mod+"<br>");
		
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
}
	
}
