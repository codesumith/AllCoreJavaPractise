package com.sumith.employee_management;

import java.sql.*;
import java.util.*;

public class ViewAllEmployeeDetailsDAO {
	
	Connection con=new DBConnection().getCon();
	
	ArrayList<EmpBean> al =new ArrayList<EmpBean>();
	
	public ArrayList<EmpBean> retrive()
	{
		
		try {
			PreparedStatement ps =con.prepareStatement("SELECT * FROM Employee56");
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next())
			{
				EmpBean eb =new EmpBean();
				
				eb.setId(rs.getString(1));
				eb.setName(rs.getString(2));
				eb.setDesg(rs.getString(3));
				eb.setBsal(rs.getFloat(4));
				eb.setTsalDB(rs.getFloat(5));
				
				al.add(eb);
			}
			
		} catch (SQLException e) {e.printStackTrace();}
		return al;
		
	}
	
	

}
