package pattarn;

import java.util.Scanner;

public class factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int i=1;
		int fact=1;
		do{
		
			fact=fact*i;
			i++;
		}while(i<=n );
		
		System.out.println("fact:"+fact);
	}
}
