package Abstraction;

public class MH extends Vehicle {

	@Override
	public void specification() {
		// TODO Auto-generated method stub
		System.out.println("MH specification");
	}

	public void m3() {
		System.out.println("Mahindra Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new MH();
		v.tyre();
		v.specification();
		System.out.println("*****************");
		MH mh = new MH();
		mh.tyre();
		mh.specification();
		mh.m3();
	}

}
