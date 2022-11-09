package JDBC.Project.Com.Java.Classmgn.ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import JDBC.Myconnection;
import JDBC.Project.Com.Java.Classmgn.Service.ClassMagtSystem;

public class ClassMangtSystemImpl implements ClassMagtSystem {
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCoursetoDatabase() {
		System.out.println(" START_ addCoursetoDatabase()");
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			System.out.println("How many course you want to added:");
			int n = sc.nextInt();
			connection = Myconnection.getconnection();
			String Sql = "insert into course values(?,?)";

			ps = connection.prepareStatement(Sql);

			for (int i = 0; i < n; i++) {
				System.out.println("Enter course id: ");
				int cid = sc.nextInt();
				ps.setInt(1, cid);
				System.out.println("Enter course Name:");
				String cname = sc.next();
				ps.setString(2, cname);
				ps.execute();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("End add course to Database");
	}

	@Override
	public void displayCoursetoDatabase() {
		Connection connection1 = null;
		try {
			connection1 = Myconnection.getconnection();
			String sql = "Select * From course";
			Statement smt = connection1.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			System.out.println("Course id\tCourse Name");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t     " + rs.getString(2));
			}
			connection1.close();
			smt.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("End Disply Course");
	}

	@Override
	public void addFacultytoDatabase() {
		System.out.println(" START_ addFacultytoDatabase()");
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			System.out.println("How many Faculty you want to added:");
			int n = sc.nextInt();
			connection = Myconnection.getconnection();
			String Sql = "insert into faculty values(?,?,?)";

			ps = connection.prepareStatement(Sql);

			for (int i = 0; i < n; i++) {
				System.out.println("Enter Faculty id: ");
				int fid = sc.nextInt();
				ps.setInt(1, fid);
				System.out.println("Enter Faculty Name:");
				String fname = sc.next();
				ps.setString(2, fname);

				displayCoursetoDatabase();
				System.out.println(" Select above course id ");
				int cid = sc.nextInt();
				ps.setInt(3, cid);
				ps.execute();

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("End add faculty to Database");

	}

	@Override
	public void displayFacultytoDatabase() {
		Connection connection1 = null;
		System.out.println("Faculty id\tFaculty Name\tCourse id\tcourse Name");
		try {
			connection1 = Myconnection.getconnection();
			String sql = "Select f.fid,f.fname,c.cid,c.cname from faculty f inner join course c on f.cid=c.cid";
			Statement smt = connection1.createStatement();
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t      " + rs.getString(2) + " \t       " + rs.getInt(3)
						+ "\t         " + rs.getString(4));
			}

			smt.close();

		} catch (Exception e) {
			
		}

	}

	@Override
	public void addBatchtoDatabasetoDatabase() {
		System.out.println(" START_ addBatchtoDatabase()");
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			System.out.println("How many batch you want to added:");
			int n = sc.nextInt();
			connection = Myconnection.getconnection();
			String Sql = "insert into batch values(?,?,?)";

			ps = connection.prepareStatement(Sql);

			for (int i = 0; i < n; i++) {
				System.out.println("Enter batch id: ");
				int bid = sc.nextInt();
				ps.setInt(1, bid);
				System.out.println("Enter batch Name:");
				String bname = sc.next();
				ps.setString(2, bname);
				displayFacultytoDatabase();

				System.out.println(" Select above faculty id ");
				int fid = sc.nextInt();
				ps.setInt(3, fid);
				ps.execute();

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("End add batch to Database");
		// TODO Auto-generated method stub

	}

	@Override
	public void displayBatchtoDatabase() {
		Connection connection1 = null;
		System.out.println("Batch id\tBatch Name\tFaculty id\tFaculty Name\tCourse id\tCourse Name");
		try {
			connection1 = Myconnection.getconnection();
			String sql = "Select b.bid,b.bname,f.fid,f.fname,c.cid,c.cname from batch b inner join faculty f on b.fid=f.fid inner join course c on f.cid=c.cid";

			Statement smt = connection1.createStatement();
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t	  " + rs.getString(2) + " \t  	 " + rs.getInt(3) + " \t	  "
						+ rs.getString(4) + "\t	 " + rs.getInt(5) + " \t	" + rs.getString(6));
			}

			smt.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("End Display Batch ");
	}

	@Override
	public void addStudenttoDatabase() {
		System.out.println(" START_ addStudent to Database()");
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			System.out.println("How many student you want to added:");
			int n = sc.nextInt();
			connection = Myconnection.getconnection();
			String Sql = "insert into student1 values(?,?,?)";

			ps = connection.prepareStatement(Sql);

			for (int i = 0; i < n; i++) {
				System.out.println("Enter Student id: ");
				int fid = sc.nextInt();
				ps.setInt(1, fid);
				System.out.println("Enter Student Name:");
				String fname = sc.next();
				ps.setString(2, fname);

				displayBatchtoDatabase();
				System.out.println(" Select above batch id ");
				int bid = sc.nextInt();
				ps.setInt(3, bid);
				ps.execute();

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("End add Student to Database");
		// TODO Auto-generated method stub

	}

	@Override
	public void displayStudenttoDatabase() {
		// TODO Auto-generated method stub
		Connection connection1 = null;
		System.out.println(
				"Student id\tStudent Name\tBatch id\tBatch Name\tFaculty id\tFaculty Name\tCourse id\tCourse Name");
		try {
			connection1 = Myconnection.getconnection();
			String sql = "Select s.sid,s.sname,b.bid,b.bname,f.fid,f.fname,c.cid,c.cname from Student1 s inner join batch b on s.bid=b.bid inner join faculty f on b.fid=f.fid inner join course c on f.cid=c.cid";

			Statement smt = connection1.createStatement();
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t	  " + rs.getString(2) + " \t  	" + rs.getInt(3) + "\t	  "
						+ rs.getString(4) + "\t	 " + rs.getInt(5) + "\t   " + rs.getString(6) + "\t	" + rs.getInt(7)
						+ " \t	" + rs.getString(8));
			}

			smt.close();

		} catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.println("End Display Batch ");
		
	}

}
