package Exception2;

public class TryCatchFinallyExample {

	public static void m1(int i) {
		System.out.println("Entry into m1 method ");
		try {

			System.out.println("Try block");
			int j = 10 / i;// ArithmeticException
			System.out.println(j);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Catch block");
			e.printStackTrace();
		} finally { // this block exceuted for any condition
		System.exit(0); // this method used for exit for method or any method
			System.out.println("Finally block");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(2);

	}

}
