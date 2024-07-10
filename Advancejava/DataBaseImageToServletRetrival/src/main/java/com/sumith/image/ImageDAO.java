package com.sumith.image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class ImageDAO {

	public Blob retrieve(HttpServletRequest req) {
	    Connection con = new DBConnection().getCon();
	    try (PreparedStatement ps = con.prepareStatement("SELECT * FROM Player_info WHERE pId=?")) {
	        ps.setString(1, req.getParameter("id"));
	        try (ResultSet rs = ps.executeQuery()) {
	            if (rs.next()) {
	                return rs.getBlob(4);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	}
	

