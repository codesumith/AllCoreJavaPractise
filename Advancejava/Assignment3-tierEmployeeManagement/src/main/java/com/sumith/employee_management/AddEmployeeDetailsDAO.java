package com.sumith.employee_management;
import java.sql.*;

public class AddEmployeeDetailsDAO {

	Connection con =new DBConnection().getCon();
	
	public int k=0;
	
	public int insert(EmpBean eb)
	{
		
		try {
			PreparedStatement ps =con.prepareStatement("INSERT INTO EMPLOYEE56 VALUES(?,?,?,?,?)");
			
			ps.setString(1, eb.getId());
			ps.setString(2, eb.getName());
			ps.setString(3, eb.getDesg());
			ps.setFloat(4, eb.getBsal());
			ps.setFloat(5, eb.getTsal());
			
			k=ps.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();}
		
		return k;
	}
}
