package SCANNER;

import java.util.Scanner;

public class A {

	int a;
	int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number1");
		 Double a =sc.nextDouble();
		 System.out.println("Enter number2");
		 Double b= sc.nextDouble();
		Double sum = a+b;
		System.out.println( "sum of the value :" +sum);
		 System.out.println();
		 String str= sc.nextLine();
		
System.out.println( str);
	}

}
