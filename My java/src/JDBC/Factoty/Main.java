package JDBC.Factoty;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.for MYSQL");
		System.out.println("2.for ORACLE");
		System.out.println("3.for Mongodb");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 0 && n > 2) {
			System.out.println(" invalid input");
		} else {

			Database db = DatabaseFactotry.creatDatabaseObject(DataBaseType.values()[n - 1]);
			db.showconnectionDeatils();
		}
	}
}
