package Exception;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" This statement will be executed");
		Integer i = new Integer("abc");// Number format exception.
		System.out.println(i);
		System.out.println("This statement will not be executed");
	}

}