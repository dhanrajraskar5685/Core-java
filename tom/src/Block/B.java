package Block;

public class B extends A {
	public B() {
		int id = 60;
		String name = "hijk";
		System.out.println(id);
		System.out.println(name);
	}

	public void m2() {
		int j = 20;
		String name = "jyotsna";
		System.out.println("m2 method of B class");
		System.out.println(j);
		System.out.println(name);
	}

	static {
		int y = 200;
		String name = "Amol";
		System.out.println(y);
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("***********main method*******");

		int eid = 122;
		String name = "der";
		System.out.println(eid);
		System.out.println(name);

		B b = new B();
		System.out.println("**********Method class ******************");
		b.m1();
		b.m2();

	}

}
