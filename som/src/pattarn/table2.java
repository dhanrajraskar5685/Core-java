package pattarn;

import java.util.Scanner;

public class table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
	
		int sum=0;
		int i=1;
		do {
			sum=sum+i;
			i++;
		}while ( i<=n);
		System.out.println("****************");
System.out.println("sum:"+sum);
		System.out.println(" completed..");

	}
	}


