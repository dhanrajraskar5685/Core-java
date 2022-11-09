package tom.returntype;

public class A {
	public void m1() {
		System.out.println("m1");
	}

	public int m2() {
		return 123;
	}

	public String m3() {
		return "amol";
	}

	public Book addbook() {
		Book b = new Book();
		b.id = 10;
		b.name = "test";
		return b;
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		int j = a.m2();
		String s = a.m3();
		System.out.println(j + "\n" + s);

		Book b = a.addbook();
		System.out.println(b.id + " \n" + b.name);

	}
}