package test;
import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/player")
@MultipartConfig(fileSizeThreshold = 1024*1024,
maxFileSize = 1024*1024*5,
maxRequestSize = 1024*1024*10)
public class PlayerServlet extends HttpServlet{

	int k=0;
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		PlayerBean  pb = new PlayerBean();
		pb.setId(req.getParameter("id"));
		pb.setName(req.getParameter("name"));
		Part photo =req.getPart("photo");
		InputStream is =null;
		if(photo!=null) {
		 is = photo.getInputStream();
		}
		
		pb.setB(is.readAllBytes());
		
	 k =new PlayerDAO().insert(pb);
		
		if(k>0) {
			PrintWriter pw =res.getWriter();
			pw.print("Player details stored successfully");
		}
		
	}
}
