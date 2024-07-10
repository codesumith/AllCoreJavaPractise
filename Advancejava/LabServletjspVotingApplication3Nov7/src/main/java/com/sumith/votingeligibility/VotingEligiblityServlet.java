package com.sumith.votingeligibility;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/votelg")
public class VotingEligiblityServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		RequestDispatcher rd =req.getRequestDispatcher("voting.jsp");
		rd.forward(req, res);
		
		
	}

}
