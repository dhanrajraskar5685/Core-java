package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CallableStatExample {

	public static void main(String[] args) {

		try {

			Connection connection = Myconnection.getconnection();
			CallableStatement cs = connection.prepareCall(" {call get_merit_student( ?,?)}");
			cs.setInt(1, 777);
			cs.setString(2, "PQR");
			cs.execute();
			System.out.println(" record inserted");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

}
