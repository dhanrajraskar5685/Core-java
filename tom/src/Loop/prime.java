package Loop;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any  number");
		int n, count =0;
		n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
			if (count == 2) 
				System.out.println("prime number ");
			else 
				System.out.println("not prime ");
		}

	}


