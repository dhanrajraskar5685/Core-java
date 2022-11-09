package Exception;

public class example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" This statement will be executed");
		try {
			Integer i = new Integer("abc");// Number format exception.
			System.out.println(i);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("This statement will also be executed");
	}

}
