package test;

import java.io.*;
import javax.servlet.*;


public class AcceptFilter implements Filter {

	public FilterConfig fcf=null;
	
	@Override
	public void init(FilterConfig fcf) throws ServletException
	{
		this.fcf=fcf;
	}
	
	@Override
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws ServletException,IOException
	{
		
		String filName=fcf.getFilterName();
		String cvalue=fcf.getInitParameter("a");
		req.setAttribute("filName", filName);
		req.setAttribute("cvalue", cvalue);
		chain.doFilter(req, res);//Link To ServletProgram
		

	}

}
