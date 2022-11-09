package pattarn;

import java.util.Scanner;

public class factorial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner( System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=n) {
		
			fact=fact*i;
			i++;
		
		
		System.out.println("fact:"+fact);
	}

	}

}
