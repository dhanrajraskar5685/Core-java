package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class CallableSelectAll {

	public static void main(String[] args) {
		try {

			Connection connection = Myconnection.getconnection();
			CallableStatement cs = connection.prepareCall(" {call get_merit_student3()}");
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {

				System.out.println(rs.getInt(1) + "" + rs.getString(2));
			}

		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

}
