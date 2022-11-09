package AccessModifiers;

class DefaultTest {

	int id = 20;                  // Data member ,method ,const.
	                             // within class and same package 
	String name = "Class";

	DefaultTest() {

	}

	void m1() {
		System.out.println("default M1 method");
	}

	public static void main(String[] args) {
		DefaultTest d = new DefaultTest();
		System.out.println(d.id);
		System.out.println(d.name);
		d.m1();
	}

}