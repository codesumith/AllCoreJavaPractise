package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/deposit")
@SuppressWarnings("serial")
public class DepositServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res ) throws ServletException,IOException{
		
		int k =new DepositDAO().deposit(req);
		
		if(k>0) {
			HttpSession hs =req.getSession(false);
			BABean bb =(BABean)hs.getAttribute("BABean");
			bb.setBal(bb.getBal()+Float.parseFloat(req.getParameter("dep")));
			
			req.setAttribute("msg", "Deposited Succesfully..");
		}
		else {
			req.setAttribute("msg", "Transaction failed");
		}
		
		RequestDispatcher rd =req.getRequestDispatcher("Msg.jsp");
		rd.forward(req, res);
	}
	
}
