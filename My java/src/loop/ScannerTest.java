package loop;

import java.util.Scanner;

public class ScannerTest {

	public static void addition(int a, int b) {

		int sum = a + b;
		System.out.println("sum:" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		System.out.println("Main metod started...");

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter Your name;");
		String name = sc.next();
		System.out.println("Hi, your name is:" + name);
		System.out.println("Enter First number for Addition:");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("Enter Second number for Addition:");
		int b = sc.nextInt();
		System.out.println(b);
		addition(a, b);

		System.out.println("Main metod completed...");

	}

}
