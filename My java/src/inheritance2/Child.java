package inheritance2;

public class Child extends Parent {

	int j = 5;

	@Override
	public void m1() {
		System.out.println("overide output");

	}

	public void m3() {

		System.out.println("m3 mathod for class Child ");
	}

	public static void main(String[] args) {
		System.out.println("*********parent class result*********");
		Parent p = new Parent();
		System.out.println(p.i);
		p.m1();
		System.out.println("************child class *************");
		Child c = new Child();
		System.out.println(c.i);
		System.out.println(c.j);
		c.m1();
		c.m2();
		c.m3();
		System.out.println("********mix class parent and child********");
		Parent p1 = new Child();
		System.out.println(p1.i);
		p1.m1();
		p1.m2();
	}

}
