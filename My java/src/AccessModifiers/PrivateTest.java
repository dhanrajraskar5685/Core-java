package AccessModifiers;

class PrivateTest {

	private int id = 10;
	private String name = "java";

	private PrivateTest() {

	}

	private void m1() {
		System.out.println("private m1 metod");
	}

	public static void main(String[] args) {
		PrivateTest t = new PrivateTest();
		System.out.println(t.id);
		System.out.println(t.name);
		t.m1();

	}
}// This private modifier access only same class ....not Access for other class
