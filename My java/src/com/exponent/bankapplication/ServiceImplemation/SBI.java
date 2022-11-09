package com.exponent.bankapplication.ServiceImplemation;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.exponent.bankapplication.Service.RBI;
import com.exponent.bankapplication.model.Account;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void registerAccount() {

		ac.setAccountNO(getAccount());

		ac.setAccountName(getAccountName());

		ac.setAadharcard(getAadharcard());

		System.out.println("Enter your Pancard Number");
		ac.setPancard(sc.next());

		ac.setMobileno(getMobileNo());

		ac.setAccountBalance(getAccountBalance());

		System.out.println("Your account registration successfull...");

	}

	public int getAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		int accno = 0;
		try {
			accno = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid Account Number");
			return getAccount();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter Number only");
		}
		String accnum = String.valueOf(accno);

		if (accno <= 0 || accnum.length() != 5)
			return getAccount();
		return accno;

	}

	public long getMobileNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your Mobile No:");
		long mobile = 0;
		try {
			mobile = sc.nextLong();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid Mobile  Number");
			return getMobileNo();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter Number only");
		}
		String accnum = String.valueOf(mobile);

		if (mobile <= 0 || accnum.length() != 10)
			return getMobileNo();
		return mobile;

	}

	public double getAccountBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Balance:");
		double balance = 0;
		try {
			balance = sc.nextDouble();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid Number Enter");
			return getAccountBalance();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter Number Only");
		}

		if (balance <= 0)
			return getAccountBalance();
		return balance;

	}

	public String getAccountName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Name:");
		String string = sc.next();

		String accnum = String.valueOf(string);
	
		if (accnum.length() <= 5 || accnum.length() <= 0 )
			return getAccountName();

		return string;

	}

	public long getAadharcard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Aadhar Number:");
		long s;
		try {
			s = sc.nextLong();
		} catch (InputMismatchException e) {

			System.out.println("Invalid your Aadhar Number");
			return getAadharcard();
		}

		String accnum = String.valueOf(s);

		if (accnum.length() != 12 || s <= 0)
			return getAadharcard();
		return s;

	}

	@Override
	public void showAccountDetails() {

		if (getshowAccountDetails() == ac.getAccountNO())
			System.out.println("Account No:" + " " + ac.getAccountNO() + "\n" + "Account Name: " + ac.getAccountName()
					+ "\n" + "\n" + "Aadharcard No: "
					+ ac.getAadharcard() + "\n" + "Pancard No: " + ac.getPancard() + " \n" + "Mobile NO: "
					+ ac.getMobileno() + "\n" + "Account Balance: " + ac.getAccountBalance());
		else {
			System.out.println("You enter wrong account number");
			showAccountDetails();
		}

	}

	private int getshowAccountDetails() {
		System.out.println("Enter Account Number");
		int accNO = sc.nextInt();
		return accNO;
	}

	@Override
	public void showAccountBalance() {
		if (getshowAccountBalance() == ac.getAccountNO())
			System.out.println("Account Balance is:" + ac.getAccountBalance());
		else {
			System.out.println("You enter wrong account number");
		}

	}

	private int getshowAccountBalance() {
		System.out.println("Enter Account Number");
		int accNO = sc.nextInt();
		return accNO;
	}

	@Override
	public void withdraMoney() {

		if (getwithdraMoney() == ac.getAccountNO())
			System.out.println("Enter Amount you wants to withdraw");
		else {
			System.out.println("Enter wrong account number");
			withdraMoney();
		}

		double amount = sc.nextDouble();
		amount = ac.getAccountBalance() - amount;
		ac.setAccountBalance(amount);
		System.out.println("Current Account balance is: " + ac.getAccountBalance());
	}

	private int getwithdraMoney() {
		System.out.println("Enter Account Number");
		int accNO = sc.nextInt();
		return accNO;
	}

	@Override
	public void depositMoney() {

		if (getAccountNumber() == ac.getAccountNO())
			System.out.println("Enter Amount you wants to deposit");
		else {
			System.out.println("You enter wrong account number");
			depositMoney();
		}
		double amount = sc.nextDouble();
		amount = ac.getAccountBalance() + amount;
		ac.setAccountBalance(amount);
		System.out.println("Current Account balance is: " + ac.getAccountBalance());

	}

	private int getAccountNumber() {
		System.out.println("Enter Account number ");
		int accNO = sc.nextInt();
		return accNO;
	}

	@Override
	public void updateAccountDetails() {
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" press 1 :change your all Account Details ");
			System.out.println(" Press 2:Change  Account Name:");
			System.out.println(" Press 3:Change  Account Mobile Number:");
			System.out.println(" Press 4:Change  Accoumt Aadharcard Number:");
			System.out.println(" Press 5:Change  Account Pancard number:");
			System.out.println(" Press 6:To exit operation:");
			int ch1 = 0;

			try {
				ch1 = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Enter valid number only");
			}

			switch (ch1) {
			case 1:
				System.out.println("Enter the updated all account details");
				registerAccount();
				break;
			case 2:
				System.out.println("Enter the updated account name : ");
				ac.setAccountName(sc.next());
				break;
			case 3:
				System.out.println("Enter the updated mobile no:");
				ac.setMobileno(sc.nextLong());
				break;
			case 4:
				System.out.println("Enter the updated aadharcard number ");
				ac.setAadharcard(sc.nextLong());
				break;
			case 5:
				System.out.println("Enter the updated pancard number");
				ac.setPancard(sc.next());
				break;
			case 6:
				System.out.println("information updated successfully ....");
				flag = false;
				break;
			default:
				System.out.println(" Enter valid opation only");

			}

		}

	}
}