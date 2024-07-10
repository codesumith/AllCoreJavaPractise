package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

public class LoginDAO {
	
	BABean bb=null;
	
	public BABean login(HttpServletRequest req) {
	
		try {
			Connection con =new DBConnection().getCon();
			PreparedStatement ps =con.prepareStatement("Select * From BankAccountDetails where ACCNO = ? AND ACCHOLDERNAME = ?");
			ps.setInt(1, Integer.parseInt(req.getParameter("acn")));
			ps.setString(2,req.getParameter("hn"));
			ResultSet rs  =ps.executeQuery();
			
			
			if(rs.next()) {
				bb=new BABean();
				bb.setAn(Integer.parseInt(req.getParameter("acn")));
				bb.setHn(req.getParameter("hn"));
				bb.setBal(rs.getFloat(3));
			}
		}catch(Exception e) {e.printStackTrace();}
		
		return bb;
	}

}
