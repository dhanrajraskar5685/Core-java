package inheritance;

public class BB extends AA {
	int j = 30;

	public void m2() {

		System.out.println("m2 method of class BB");

	}

	public static void main(String[] args) {
		BB b = new BB();
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		b.m2();

	}
}
