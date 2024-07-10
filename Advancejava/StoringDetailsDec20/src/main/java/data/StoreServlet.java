package data;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/store")
public class StoreServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		
		ObjectBean ob =new ObjectBean();
		
		ob.setFirstName(req.getParameter("fname"));
		ob.setLastName(req.getParameter("lname"));
		ob.setPhn(Long.parseLong(req.getParameter("Phone")));
		ob.setMailId(req.getParameter("email"));
		
		if(new StoreDAO().storeData(ob)>0) {
			req.setAttribute("ob", ob);
			RequestDispatcher rd =req.getRequestDispatcher("Out.jsp");
			rd.forward(req, res);
		}
		else {
			req.setAttribute("Msg", "Invalid request");
			RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		
	}

}
