package Loop;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("number befor swaping " + a + " " + b);
		int c = 0;
//		c = a;
//		a = b;
//		b = c;
//		System.out.println("Number after swaping  " + a + " " + b);
		a=a+b;//5+2=7
		b=a-b;//7-2=5=b
		a=a-b;//7-5=2=a
		System.out.println("Number after swaping  " + a + " " + b);
	}

}
