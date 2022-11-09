package Loop;

import java.util.Scanner;

public class oddandeven {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any  number");

		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("even number");
		}

		else
			System.out.println("odd number");
	}
}
