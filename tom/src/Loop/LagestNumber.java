package Loop;

public class LagestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 101, 111, 5555,111, 444, 888, 69, 45, 88, 999 };
		int max = arr[0];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < max) {
				max = arr[i];
				count = i;

			}

		}

		System.out.println("lagest number is " + max + " " + count);

	}

}
