package Polymorphism;

public class Parent {

	public void m1() {
		System.out.println("Parent Class m1 method ");

	}

	public void m2() {
		System.out.println("Parent Class m2 method ");

	}

	public String m3() {
		System.out.println("Parent Class m3 method ");
		return "xyz";
	}

	public Parent m4() {
		System.out.println("parent class m4 method");
		Parent p = new Parent();
		return p;
	}

}
