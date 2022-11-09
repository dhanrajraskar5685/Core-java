package SuperAndThisKeyword;

public class C {

	public C() {
		this('s');
		System.out.println("Default constructor in class c ");

	}

	public C(int i, int j) {
		this();
		System.out.println("double parameter in class c");

	}

	public C(char s) {

		System.out.println("char s");

	}
}

	