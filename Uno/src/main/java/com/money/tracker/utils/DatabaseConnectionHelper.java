package com.money.tracker.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionHelper {

	private static Connection conn;
	//private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	//private static final String DB_URL = "jdbc:mysql://localhost/ariel_sample?user=root&password=";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_USER = "nonadmin_user";
	private static final String DB_PASSWORD = "local";
	
	public Connection createConnection() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {
		
		Class.forName(JDBC_DRIVER).newInstance();
		conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		
		
		return conn;
	}

}
