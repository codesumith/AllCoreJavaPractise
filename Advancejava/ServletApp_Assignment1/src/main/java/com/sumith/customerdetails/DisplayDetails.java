package com.sumith.customerdetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/cus")
public class DisplayDetails extends GenericServlet{

	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw =res.getWriter();
		
		res.setContentType("text/html");
		
		String cId=req.getParameter("cid");
		String cName=req.getParameter("cname");
		String city=req.getParameter("ccity");
		String state=req.getParameter("cstate");
		String pinCode=req.getParameter("cpincode");
		String mid=req.getParameter("cmid");
		String phNo=req.getParameter("cphno");
		
		pw.println("<br>CoustomerID      :"+cId);
		pw.println("<br>CoustomerName    :"+cName);
		pw.println("<br>CoustomerCity    :"+city);
		pw.println("<br>CoustomerState   :"+state);
		pw.println("<br>CoustomerPincode :"+pinCode);
		pw.println("<br>CoustomerMail-Id :"+mid);
		pw.println("<br>CoustomerPhnNo   :"+phNo);
	}

}
