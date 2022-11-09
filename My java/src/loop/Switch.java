package loop;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method started..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your month number: ");
		int a = sc.nextInt();
		int monthNumber = a;

		switch (monthNumber) {
		case 1:
			System.out.println("You selected january ");
			break;
		case 2:
			System.out.println("You are selected february");
		case 3:
			System.out.println("You selected march ");
			break;
		case 4:
			System.out.println("You are selected april");
		case 5:
			System.out.println("You selected may ");
			break;
		case 6:
			System.out.println("You are selected june");
		case 7:
			System.out.println("You selected july ");
			break;
		case 8:
			System.out.println("You are selected august");
		case 9:
			System.out.println("You selected september");
			break;
		case 10:
			System.out.println("You are selected october");
		case 11:
			System.out.println("You selected november ");
			break;
		case 12:
			System.out.println("You selected December ");
			break;
		default:
			System.out.println(" YOU are enter invaild naumber");

		}

	}

}
