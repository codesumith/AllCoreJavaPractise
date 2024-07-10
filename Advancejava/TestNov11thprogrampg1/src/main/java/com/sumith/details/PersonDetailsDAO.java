package com.sumith.details;
import java.sql.*;

public class PersonDetailsDAO {
	
	Connection con =new DBConnection().getCon();
	
	public void insert (PersonalDetails p)
	{
		try {
			PreparedStatement ps =con.prepareStatement("Insert into PersonalDetails Values(?,?,?,?,?)");
			
			ps.setString(1, p.getName());
			ps.setString(2, p.getAge());
			ps.setString(3, p.getMobile());
			ps.setString(4, p.getGender());
			
			 String[] hobbiesArray = p.getHobbies();
	            String hobbies = (hobbiesArray != null) ? String.join(",", hobbiesArray) : "";
			
			ps.setString(5, hobbies);
			
			ps.execute();
			
		} catch (Exception e) {}
	}

}
