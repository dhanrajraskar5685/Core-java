package loop;

public class NoramalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started...");
		int sum = 0;
		sum = addition(sum, 1);
		sum = addition(sum, 2);
		sum = addition(sum, 3);
		sum = addition(sum, 4);
		sum = addition(sum, 5);

		System.out.println("sum is:" + sum);
		System.out.println(" main method completed ");
	}

	private static int addition(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;
		return sum;
	}
}
