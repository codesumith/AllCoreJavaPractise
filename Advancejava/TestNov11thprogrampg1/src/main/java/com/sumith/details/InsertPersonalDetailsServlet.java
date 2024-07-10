package com.sumith.details;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/details")
public class InsertPersonalDetailsServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PersonalDetails p =new PersonalDetails();
		
		p.setName(req.getParameter("uname"));
		p.setAge(req.getParameter("age"));
		p.setMobile(req.getParameter("mobile"));
		p.setGender(req.getParameter("gender"));
		
		
		p.setHobbies(req.getParameterValues("hobbies[]"));
		
		new PersonDetailsDAO().insert(p);
		
	}

}
