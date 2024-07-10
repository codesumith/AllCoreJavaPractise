package data;
import java.sql.*;

public class DBConnection {
	
	Connection con;
	public Connection getCon() {
		try {
		Class.forName(DBinfo.driver);
		con=DriverManager.getConnection(DBinfo.dburl,DBinfo.user,DBinfo.password);
		}
		catch(Exception e) { e.printStackTrace();}
		
		return con;
	}

}
