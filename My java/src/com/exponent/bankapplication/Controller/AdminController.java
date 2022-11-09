package com.exponent.bankapplication.Controller;

import java.util.Scanner;

import com.exponent.bankapplication.Service.RBI;
import com.exponent.bankapplication.ServiceImplemation.SBI;

public class AdminController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;
		RBI rbi = new SBI();

		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("*********Welcome To Bank Application***************");
			System.out.println("1.Create Account");
			System.out.println("2.Show Account Details");
			System.out.println("3.Show Account Balance");
			System.out.println("4.Deposit Money");
			System.out.println("5.Withdraw Money");
			System.out.println("6.Update Account Details");
			System.out.println("7.Exit");

			int ch = 0;
			try {
				ch = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Enter  Number Only ");
			}
			switch (ch) {
			case 1:
				rbi.registerAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.depositMoney();
				break;
			case 5:
				rbi.withdraMoney();
				break;
			case 6:
				rbi.updateAccountDetails();
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("You are Enter invalid choice");
				break;
			}

		}
	}
}