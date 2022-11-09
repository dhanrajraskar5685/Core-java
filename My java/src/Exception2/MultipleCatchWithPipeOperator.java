package Exception2;

public class MultipleCatchWithPipeOperator {

	public static void main(String[] args) {

		try {

			System.out.println("..Main method inside..");
			String s = args[0];
			System.out.println("Value of s:" + s);
			int i = Integer.parseInt(s);
			int j = 10 / i;
			System.out.println("value of j:" + j);
			String s1 = null;
			System.out.println(s1.length());
			// follow sub to super

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			// TODO: handle exception
			System.out.println("use pipe operetor");
			System.out.println(e);
		}

	}

}
