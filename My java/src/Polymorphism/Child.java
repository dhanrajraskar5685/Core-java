package Polymorphism;

public class Child extends Parent {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Overrided m1 method in child");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Overrided m2 method in child");
	}

	@Override
	public String m3() {
		// TODO Auto-generated method stub
		System.out.println("Overrided m3 method in child");
		return "ugale";
	}

	@Override
	public Parent m4() {
		// TODO Auto-generated method stub
		System.out.println("Overrided m4 method in child");
		Parent p1 = new Parent();
		Parent p = new Parent();
		return p1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-parent class -");
		Parent p1 = new Parent();
		p1.m1();
		p1.m2();
		p1.m3();
		p1.m4();
		System.out.println("--- parent child mix---");
		Parent p = new Child();
		p.m1();
		p.m2();
		p.m3();
		p.m4();

		System.out.println("--Child class --");
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		c.m4();

	}

}
