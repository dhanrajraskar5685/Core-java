package JDBC.Project.Com.Java.Classmgn.Controller;

import java.util.Scanner;

import JDBC.Project.Com.Java.Classmgn.ServiceImpl.ClassMangtSystemImpl;

public class MainClass {
	public static void main(String[] args) {

		boolean flag = true;
		ClassMangtSystemImpl classMangtSystemImpl = new ClassMangtSystemImpl();

		while (flag) {
			Scanner sc = new Scanner(System.in);

			System.out.println("*******************************************");
			System.out.println("*********Welcome To Menu ***************");
			System.out.println("1.Add Course to Database");
			System.out.println("2.Display Course to Database");
			System.out.println("3.Add Faculty to Database");
			System.out.println("4.Display Faculty to Database");
			System.out.println("5.Add Batch to Database");
			System.out.println("6.Display Batch to Database");
			System.out.println("7.Add Student to Database");
			System.out.println("8.Display Student to Database");
			System.out.println("9.Exit");
			System.out.println("-------------------------------------------");
			int ch = 0;
			System.out.println("Select Above Choice:");
			try {
				ch = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" plz,Enter Number Only ");
			}

			switch (ch) {

			case 1:
				classMangtSystemImpl.addCoursetoDatabase();
				break;
			case 2:
				classMangtSystemImpl.displayCoursetoDatabase();
				break;
			case 3:
				classMangtSystemImpl.addFacultytoDatabase();
				break;
			case 4:
				classMangtSystemImpl.displayFacultytoDatabase();
				break;
			case 5:
				classMangtSystemImpl.addBatchtoDatabasetoDatabase();
				break;
			case 6:
				classMangtSystemImpl.displayBatchtoDatabase();
				break;
			case 7:
				classMangtSystemImpl.addStudenttoDatabase();
				break;
			case 8:
				classMangtSystemImpl.displayStudenttoDatabase();
				;
			case 9:
				flag = false;
				break;
			default:
				System.out.println("You are Enter invalid choice");
				break;
			}

		}
	}
}
