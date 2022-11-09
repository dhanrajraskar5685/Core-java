package Inheritance;

public class B extends A {
	
	public int m2() {
		int salary = 6000;
		
		return salary+m1();
	}
 public static void main( String[] args) {
	 B b = new B();
	//b. m1();
	 System.out.println(b.m1());
	 System.out.println(b.m2());
	 
 }
}
