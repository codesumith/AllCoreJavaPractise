package com.sumith.empreg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletRequest;

public class LoginDAO {

	public String s;
	
	public String login(ServletRequest req)
	{
		
		Connection con =new DBConnection().getcon();
		   try {
			  PreparedStatement ps =con.prepareStatement("Select * from EmpDetail Where EmployeeName =? And Id =? ");
			  ps.setString(1, req.getParameter("ename"));
			  ps.setString(2,req.getParameter("eid"));
			  
			
			 ResultSet rs =ps.executeQuery();
			 if(rs.next())
			 {
				 s=rs.getString(1);
			 }
			  
		   }catch(Exception e) {e.printStackTrace();}
		return s;
		
	}
}
