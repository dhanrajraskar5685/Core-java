package Exception2;

public class InnerTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(".....Main method...... ");

		try {
			System.out.println(".....outer try .........");
			String s = null;
			System.out.println(" Value of s:" + s.length());

			try {
				Integer i = new Integer(s);
				System.out.println("valure of i is " + i);
				System.out.println("...inner  try block...");

			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("... inner catch...");
				e.printStackTrace();
			} finally {
				System.out.println("*****************");

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("outer try catch");
			e.printStackTrace();
		} finally {
			System.out.println("Finally ");

		}

	}

}
