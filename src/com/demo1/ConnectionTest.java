package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	Connection connection=null;
	public Connection getConnectionDetails() throws SQLException
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql:localhost:3306/demo","root","root");
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	return connection;

		
	

	}
}
