package test;
import java.sql.*;

public class DBConnection {

	Connection con;
	public Connection getCon() {
		try {
		Class.forName(DBInfo.driver);
		con=DriverManager.getConnection(DBInfo.DBurl,DBInfo.uname,DBInfo.pass);
		}catch(Exception e) {e.printStackTrace();}
		return con;
	}
	
}
