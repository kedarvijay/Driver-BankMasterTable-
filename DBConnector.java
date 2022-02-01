package com.jdbc;

import java.sql.DriverManager;

public class DBConnector {
	public static java.sql.Connection getConnected() throws Exception{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
	}

}
