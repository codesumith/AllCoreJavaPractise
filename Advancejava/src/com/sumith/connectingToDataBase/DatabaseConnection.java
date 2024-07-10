package com.sumith.connectingToDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/practise";
    private static final String USER = "root";
    private static final String PASSWORD = "Sumith@349";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }
    public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}
}
