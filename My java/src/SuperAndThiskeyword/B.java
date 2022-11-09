package SuperAndThiskeyword;

public class B extends A {

	int j = 20;

	public void m2() {

		super.m1();
		System.out.println("M2 method of class B");
	}

	public void m3() {
		this.m2();
		System.out.println("M3 method of class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		// b.m2();
		b.m3();
	}

}
