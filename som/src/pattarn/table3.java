package pattarn;

import java.util.Scanner;

public class table3 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner( System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
	
		int sum=0;
		int i=1;
		while(i<=n) {
			
			//System.out.println(" inside while loop");
		sum=sum+i;
			i++;
		}
		System.out.println("sum is:" +sum);


			}

		
	}


