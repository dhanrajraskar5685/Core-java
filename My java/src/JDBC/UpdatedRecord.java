package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class UpdatedRecord {
	Connection connection=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/b21", "root", "root");
			String sql = "update employee1 set ename='Dhanraj' where eid in (10)";
			Statement smt = connection.createStatement();
			int i = smt.executeUpdate(sql);
		
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
			
			} catch (Exception e2) {
				// TODO: handle exceptionF
			}
			
			
		}

	}


}
