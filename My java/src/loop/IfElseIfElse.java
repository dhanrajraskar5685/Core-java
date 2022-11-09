package loop;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Strated ...");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage:");
		int p = sc.nextInt();
		if (p > 66) {
			System.out.println(" You are in higher class ");
		} else if (p > 60) {
			System.out.println("you are in first class  ");

		} else if (p > 55) {
			System.out.println("you are in second class ");
		} else if (p > 50) {
			System.out.println("you are in pass class ");
		} else if (p > 40) {
			System.out.println("you are  failed");
		}
		System.out.println("main method completed.....");
	}

}
