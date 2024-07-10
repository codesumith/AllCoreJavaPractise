package com.sumith.library;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBookDetailsServlet extends GenericServlet{
	
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		BookBean bb= new BookBean();
		
		bb.setCode(req.getParameter("bcode"));
		bb.setName(req.getParameter("bname"));
		bb.setAuthor(req.getParameter("bauthor"));
		bb.setPrice(Double.parseDouble(req.getParameter("bprice")));
		bb.setQty(Integer.parseInt(req.getParameter("bqty")));
		
		int k=new AddBookDetailsDAO().insert(bb);
		if(k>0)
		{
			RequestDispatcher rd =req.getRequestDispatcher("AddBook.jsp");
			rd.forward(req, res);
		}
		
	}
	
	

}
