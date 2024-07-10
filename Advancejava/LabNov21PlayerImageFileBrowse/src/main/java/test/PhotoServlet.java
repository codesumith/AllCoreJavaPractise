package test;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/retrive")
public class PhotoServlet extends HttpServlet{
	
	byte b[] =null;
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	  try
	  {
		  res.setContentType("image/jpeg");
		  ServletOutputStream sos = res.getOutputStream();

			Connection con =new DBConnection().getcon();
			PreparedStatement ps =con.prepareStatement("SELECT * FROM PlayerInfo WHERE Id=?");
			ps.setString(1, "R45");
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				 b=rs.getBytes(3);
				 sos.write(b);
			}
			
			
			
			
	  }catch(Exception e) {e.printStackTrace();}
	}
}
