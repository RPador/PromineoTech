package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

	private static final String HOST = "localhost";
	private static final String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";
	
	
	
public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",
				HOST, PORT, SCHEMA, USER, PASSWORD);
		System.out.println("Connection to 'projects' is successful");
	
		
		try {
			Connection conn = DriverManager.getConnection(url);
			
			return conn;
		} catch (SQLException e) {
			System.out.println("ERROR");
		throw new DbException(e);
		}
	}
}
