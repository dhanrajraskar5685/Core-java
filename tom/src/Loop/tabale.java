package Loop;

import java.util.Scanner;

public class tabale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any  number");

		int n = sc.nextInt();

		{

			for (int i = 2; i <=10; i++)
				System.out.println(i * n);

		}

	}
}