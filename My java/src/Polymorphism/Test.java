package Polymorphism;

public class Test {

	public static void m1(Object object) {

		System.out.println("****object***");
	}

	public static void m1(String string) {

		System.out.println("***String ***");
	} // always null value store in child class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(null);// any class capable store null value
	}

}
