package Inheritance;

import java.util.Scanner;

public class Z extends Y {

	@Override
	public void substraction(int x, int y, int z) {
		// TODO Auto-generated method stub
		z = x - y - z;
		System.out.println("The override value of substraction:" + z);
	}

	@Override
	public void multipication(int x, int y) {
		// TODO Auto-generated method stub
		z = x * x * y;
		System.out.println("The override value of multipication:" + z);
	}

	public static void main(String[] args) {
		Y y1 = new Z();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter Value of c: ");
		int c = sc.nextInt();
		System.out.println("Enter your name:");
		String name = sc.next();

		y1.substraction(a, b, c);
		y1.addition(a, b);
		y1.multipication(a, b);
		y1.division(a, b);

		System.out.println("Hi , " + name + " You have completed calculations..");
	}

}