package com.sumith.userdetails;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/user")
public class DisplayDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		String firstName=req.getParameter("fname");
		String lastName=req.getParameter("lname");
		String email=req.getParameter("email");
		Long  mobile=Long.parseLong(req.getParameter("mobile"));
		String address=req.getParameter("address");
		
		pw.println("<p style='font-size: 24px;'>====Customer-Details====");
		pw.println("<br><p style='font-size: 24px;'>FirstName :"+firstName);
		pw.println("<br><p style='font-size: 24px;'>LaststName :"+lastName);
		pw.println("<br><p style='font-size: 24px;'>Email-Id :"+email);
		pw.println("<br><p style='font-size: 24px;'>Phone :"+mobile);
		pw.println("<br><p style='font-size: 24px;'>Address :"+address);
		pw.println("<br><h1>THANKYOU</h1>");
		
		
		
	}

}
