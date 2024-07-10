package com.sumith.image;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/image")
public class Imageservlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    Blob s = new ImageDAO().retrieve(req);

	    if (s != null) {
	        res.setContentType("image/jpg");
	        try (InputStream is = s.getBinaryStream();
	             ServletOutputStream sos = res.getOutputStream()) {

	            byte[] buffer = new byte[4096];
	            int bytesRead;

	            while ((bytesRead = is.read(buffer)) != -1) {
	                sos.write(buffer, 0, bytesRead);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } else {
	        // Handle the case when the Blob is not found in the database
	        res.setContentType("text/plain");
	        res.getWriter().write("Image not found");
	    }
	}


	}
	

