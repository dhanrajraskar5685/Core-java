import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("calculator started...");
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.Addition");
		System.out.println(" 2.Substraction");
		System.out.println(" 3.Multiplication");
		System.out.println(" 4.Division");
		System.out.println(" 5.percentage");
		while(true) {
		System.out.println("Enter first number for operation:");
		int number1 = sc.nextInt();
		
		System.out.println("Enter second number for operation:");
		int number2 = sc.nextInt();
		//System.out.println("select any operation from above:");
        //while(true) {
    	System.out.println("select any operation from above:");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			int sum = number1 + number2;
			System.out.println("Addition is: " + sum);
			break;
		case 2:
			int Substraction = number1 - number2;
			System.out.println("Substraction is: " + Substraction);
			break;
		case 3:
			int Multiplication = number1 * number2;
			System.out.println("Multiplication is: " + Multiplication);
			break;
		case 4:
			int Division = number1 / number2;
			System.out.println("Division is: " + Division);
			break;
		case 5:
			int percentage = number1 * 100 / number2 ;
			System.out.println("percentage:" + percentage);
			break;
		default:
			System.out.println("you have selected invalied option");
		
		}
		
       
		//System.out.println(" Calculator stopped....");
        }
	}
}
