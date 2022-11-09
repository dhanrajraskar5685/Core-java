import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		System.out.println(" Main method started..");
		int number = 105;
		switch (number) {
		case 102:
			System.out.println("inside 1st case..");
			break;

		case 105:
			System.out.println("inside 2nd case..");
			break;

		default:
			System.out.println(" inside default case ...");
		}
		System.out.println(".............................");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		switch (name) {
		case "ABC":
			System.out.println("1st case: hi " + name + ",Welcome to switch case" + "");
			break;
		case "DEF":
			System.out.println("2nd case: hi " + name + ",Welcome to switch case" + "");
			break;
		case "XYZ":
			System.out.println("3rd case: hi " + name + ",Welcome to switch case" + "");
			break;
		default:
			System.out.println("Default ....");
			break;
		}
		System.out.println("Main method completed...");
	}
}
