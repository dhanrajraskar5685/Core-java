package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection = Myconnection.getconnection();
			String sql = "update employee1 set ename=? where eid=?";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name to update ename");
			String ename = sc.next();
			System.out.println("Enter employee eid whose ename u want update");
			int update = sc.nextInt();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, ename);
			ps.setInt(2, update);
			ps.executeUpdate();
			connection.close();
			System.out.println("Success");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
