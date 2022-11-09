package Inheritance;

import java.util.Scanner;

public class Y extends X {

	public void multipication(int x, int y) {

		z = x * y;
		System.out.println("The multipication  of number:" + z);
	}

	public void division(int x, int y) {

		z = x / y;
		System.out.println("The division  of number:" + z);
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a");
		int a = sc.nextInt();
		System.out.println("Enter Value of b");
		int b = sc.nextInt();
		System.out.println("Enter Value of c");
		int c = sc.nextInt();

		Y y = new Y();
		y.addition(a, b);
		y.substraction(a, b, c);
		y.multipication(a, b);
		y.division(a, b);

	}
}