package tom.returntype;

import java.util.Scanner;

public class IfElseIfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" method start");
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value");
		int a = sc.nextInt();
		System.out.println(" method End");
		if (a>=90){
		System.out.println( " class A");}
		else if (a>=80){
			System.out.println( " class B");
			}
		else if (a>=70){
			System.out.println( " class C");
			}
		else if (a>=60){
			System.out.println( " class D");
			}
		else {
				System.out.println( " class is failed");
				}
		}
		

	}


