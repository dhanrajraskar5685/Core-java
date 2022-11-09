package Inheritance;

public class C extends B {

	public int m3() {
		
		int salary = 7000;
		 return salary;
	}
		public static void main( String[] args) {
			 C c = new C();
			//b. m1();
			 System.out.println( " salary of 1st employee :" + c.m1());
			 System.out.println( " salary of 2st employee :" + c.m2());
			 System.out.println( " salary of 3st employee :" +c.m3());
			 
			 
		 }
	}


