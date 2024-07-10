package com.sumith.bookdetails;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateBookDetailsServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException
	{
		
		HttpSession hs =req.getSession(false);
		
		if(hs==null)
		{
			req.setAttribute("msg","Session Expired...<br>");
			
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			String bcode=req.getParameter("bcode");
			@SuppressWarnings("unchecked")
			ArrayList<BookBean> al =(ArrayList<BookBean>) hs.getAttribute("al");
			Iterator<BookBean> it =al.iterator();
			int k=0;
			while(it.hasNext())
			{
				BookBean bb =(BookBean)it.next();
				if(bcode.equals(bb.getBcode()))
				{
					bb.setPrice(Float.parseFloat(req.getParameter("price")));
					bb.setQty(Integer.parseInt(req.getParameter("qty")));
					 k= new UpdateBookDetailsDAO().update(bb);
	
				}
			}
			
			if(k>0)
			{
				RequestDispatcher rd =req.getRequestDispatcher("update.jsp");
				rd.forward(req, res);
			}
		}
	}

}
