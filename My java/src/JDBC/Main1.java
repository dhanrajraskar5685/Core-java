package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b21", "root", "root");
			String sql = "insert into employee1 values( ?, ?, ?)";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee eid");
			int id = sc.nextInt();
			System.out.println("Enter employee name ");
			String ename = sc.next();
			System.out.println("Enter employee Address");
			String eaddress = sc.next();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, ename);
			ps.setString(3, eaddress);
			ps.execute();
			connection.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
