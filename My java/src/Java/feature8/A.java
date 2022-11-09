package Java.feature8;

public class A implements I{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method of A");
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		I.super.m2();
		System.out.println(" Data overrried");
	}

}
