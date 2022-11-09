package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Insertrecord {
	public static void main(String[] args) {

		try {
			// 1.load drive

			Class.forName("com.mysql.jdbc.Driver");
			// 2.create the connection
			Connection connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/b21", "root", "root");

			// 3.bulid sql query
			String sql = "insert into employee1 values( 14,'ajas','nigdi')";

			// 4.create the statement

			Statement smt = connection.createStatement();
			smt.execute(sql);
			connection.close();
			System.out.println("Record insert");
		} catch (Exception e) {
			// TODO: handle
			e.printStackTrace();
		}

	}


}
