package Polymorphism;

public class MethodOverloading {
	
	private final int m1(String s) {
		
		System.out.println("M1 method single Parameter");
		return 10;
	}
	 protected static void m1(String s,int i) {
		 
		 System.out.println("M1 method of double parameter");
		 
	 } // private final static main only this also overloading 
	
	 public static void main(Integer [] args) {
		 
	 }// Method overloading also used in main method
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m= new MethodOverloading();
		m1("Dhanraj", 12);
	m.m1("raj");
		
	}

}
