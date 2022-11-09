package FinalKeyword;

public  final class Demo { //class not extends due to final word

	final int id=10; // value is final cant change this value

	public final void m1() {

		System.out.println("M1 final method");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		// final value cant change .you not assign new value for variable
		 d.m1();
		System.out.println(d.id);

	}
}