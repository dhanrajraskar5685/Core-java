package loop;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method startd......");
		int sum = 0;// 1.initialization ; 2.condition; 3.increment/decrement
		for (int i = 1; i <= 6; i++) {

			System.out.println("inside for loop " + i);

			sum = addition(sum, i);
		}
		System.out.println("sum is :" + sum);
		System.out.println(" main method completed ...");
	}

	private static int addition(int a, int b) {
		return a + b;
	}
}
