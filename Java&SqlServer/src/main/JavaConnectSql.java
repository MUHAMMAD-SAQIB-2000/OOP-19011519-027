package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnectSql {

	public static void main(String[] args) throws SQLException 
	{
		String dbURL = "jdbc:sqlserver://MYSQL\\sqlserver;databaseName=STUDENT";
		String user = "saqib";
		String password = "jhiller12";
		System.out.println("is it working?");
		
		@SuppressWarnings("unused")
		Connection connection  = DriverManager.getConnection(dbURL, user, password);
	}

}
