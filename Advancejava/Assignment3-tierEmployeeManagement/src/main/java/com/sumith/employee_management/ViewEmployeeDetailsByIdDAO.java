package com.sumith.employee_management;
import java.sql.*;

public class ViewEmployeeDetailsByIdDAO {
	
	Connection con =new DBConnection().getCon();
	
	EmpBean eb=new EmpBean();
	
	
	public EmpBean retiveById(String id )
	{
		try
		{
		
			PreparedStatement ps =con.prepareStatement("Select * FROM Employee56 WHERE Id=?");
			
			ps.setString(1, id);
			
			ResultSet rs =ps.executeQuery();
			
			rs.next();
			
			eb.setId(id);
			eb.setName(rs.getString(2));
			eb.setDesg(rs.getString(3));
			eb.setBsal(rs.getFloat(4));
			eb.setTsalDB(rs.getFloat(5));
			
		}catch(Exception e) {e.printStackTrace();}
		
		return eb;
		
	}

}
