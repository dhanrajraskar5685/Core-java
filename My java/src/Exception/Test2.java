package Exception;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this statement will be executed");
		try {
			int i = 10 / 0;// ArithmeticException
			System.out.println(i);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println(" now ,this statement will also be executed");
	}

}
