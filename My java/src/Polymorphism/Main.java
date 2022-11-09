package Polymorphism;

public class Main {

	public void m1(int i) {

		System.out.println(" M1 method of single parameter");

	} // - method name same and parameter is always different.

	public void m1(int i, int j) {

		System.out.println(" M1 method of double parameter");

	}

	public static void main(String[] args) {

		Main main = new Main();
main.m1(10,12);
System.out.println("10"); // java write println all method .example for polymorph
System.out.println(10);
System.out.println(10.10d);
System.out.println(true);
System.out.println('c');
	}

}