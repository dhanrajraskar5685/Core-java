package Exception;

public class solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this statement will be executed ");

		try {
			// we give value through configruration
			String s = args[1];
			System.out.println(s);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("this statement will  also be  executed ");
	}

}
