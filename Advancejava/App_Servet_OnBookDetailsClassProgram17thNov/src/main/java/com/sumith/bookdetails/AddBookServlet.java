package com.sumith.bookdetails;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/addbook")
public class AddBookServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req,HttpServletResponse res ) throws ServletException,IOException
	{
		HttpSession hs =req.getSession(false);
		
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired..<br>");
			
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else {
		BookBean bb=new BookBean();
		bb.setBcode(req.getParameter("bcode"));
		bb.setBname(req.getParameter("bname"));
		bb.setAuthor(req.getParameter("bauthor"));
		bb.setPrice(Float.parseFloat(req.getParameter("bprice")));
		bb.setQty(Integer.parseInt(req.getParameter("qty")));
		
		int k =new AddBookDetailsDAO().insert(bb);
		if(k>0)
		{
			RequestDispatcher rd = req.getRequestDispatcher("addbook.jsp");
			rd.forward(req, res);
		}
		}
	}
	
}
