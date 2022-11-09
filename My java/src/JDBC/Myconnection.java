package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Myconnection {

	private static Connection connection = null;

	private Myconnection() {

	}

	public static Connection getconnection() {
		if (connection == null)
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b21", "root", "root");
			return connection;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return connection;

	}

}
