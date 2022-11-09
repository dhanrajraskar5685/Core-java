package String;

public class valueOf {

	public static void main(String[] args) {
		// Value of method
		// The java string valueOf() method converts different types of values into
		// string.
		// By the help of string valueOf() method, you can convert int to string,
		// long to string, boolean to string, character to string, float to string,
		// double to string, object to string and char array to string.

		int i = 30;
		String s = String.valueOf(i);
		System.out.println(s + " dhanraj");
		String c = String.valueOf(i);
		System.out.println(c + 'c');

		char c1 = 'p';
		String s1 = String.valueOf(c1);
		System.out.println(s1 + 10 + 10 + "Dhanraj");

		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");

		boolean b1 = true;
		byte b2 = 11;
		short sh = 12;
		int ii = 13;
		long l = 14L;
		float f = 15.5f;
		double d = 16.5d;
		char chr[] = { 'D', 'H', 'A', 'N', 'R', 'A', 'J' };

		String n = String.valueOf(b1);
		System.out.println(n);
		String n1 = String.valueOf(b2);
		System.out.println(n1);
		String n0 = String.valueOf(sh);
		System.out.println(n0);
		String n2 = String.valueOf(ii);
		System.out.println(n2);
		String n3 = String.valueOf(l);
		System.out.println(n3);
		String n4 = String.valueOf(f);
		System.out.println(n4);
		String n5 = String.valueOf(d);
		System.out.println(n5);
		String n6 = String.valueOf(chr);
		System.out.println(n6);

	}

}
