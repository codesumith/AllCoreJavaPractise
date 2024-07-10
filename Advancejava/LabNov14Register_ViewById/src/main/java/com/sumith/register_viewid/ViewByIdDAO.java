package com.sumith.register_viewid;
import java.sql.*;

public class ViewByIdDAO {
	
	Connection con =new DBConnection().getcon();
	
	Employee e = new Employee();
	
	public Employee retrive(String id)
	{
		try {
			PreparedStatement ps =con.prepareStatement("Select * From EmpDetails Where Id=?");
			ps.setString(1, id);
			
			 ResultSet rs =ps.executeQuery();
			
		if(rs.next())
		{
			e.setId(rs.getString(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getDouble(3));
			e.setAddress(rs.getString(4));
		}
	
			
		} catch (SQLException ex) {ex.printStackTrace();}
		
		return e;
		
	}

}
