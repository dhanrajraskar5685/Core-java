package Exception2;

public class TheowKeyWord {

	public  static void ValidAge(int age) {
		System.out.println("Entery into the validateAge method");
		if (age < 18) {
			throw new ArithmeticException(
					"Person is eligible to create the bank acccount,please visit aftere completing age 18");
		} else {
			System.out.println("Person is eligible for creating the bank Account");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ValidAge(17);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
