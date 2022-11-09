package inheritance2;

public class D extends C {
	int d = 12;

	public void m3() {

		System.out.println("m3 method for class D");

	}

	public void m4() {

		System.out.println("m4 method for class D");

	}

	@Override
	public void m2() {
		System.out.println("Overrided m2 method in D class");
	}

}
