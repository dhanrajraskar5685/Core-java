import java.util.Scanner;

public class IFElseIFElse {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		IFElseIFElse ifelseclass = new IFElseIFElse();
		ifelseclass.m1();
		ifelseclass.printGrade();

		System.out.println(" main method completed");
	}

	public void m1() {
		boolean flag = true;
		if (flag) {
			System.out.println("inside if condition....1");
		} else {

			System.out.println("flag is false ");
		}
		boolean flag1 = (30 < 20);
		if (flag1) {
			System.out.println("10 is less than 20");
		} else {
			System.out.println(" false statment 10 is less than 20");

		}
		int d = 15;
		if (d == 10)
			System.out.println(" a is exact 10");
		else if (d == 13) {
			System.out.println(" a is exact 13");
		} else if (d == 15) {
			System.out.println(" a is exact 15");
		}

		else {
			System.out.println(" a is not 10 ");
		}
	}

	public void printGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your test score ");
		int testscore = sc.nextInt();
		if (testscore >= 90) {
			System.out.println("your grade is A ");
		} else if (testscore >= 80) {
			System.out.println("your grade is B ");
		} else if (testscore >= 70) {
			System.out.println("your grade is C ");
		} else if (testscore >= 40) {
			System.out.println("you are in pass class ");
		} else {
			System.out.println("you are failed");
		}

	}
}
