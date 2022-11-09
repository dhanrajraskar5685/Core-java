package Abstraction;

public class VW extends Vehicle {
	@Override
	public void specification() {
		// TODO Auto-generated method stub
		System.out.println("VW specification");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new VW();
		v.tyre();
		v.specification();
		System.out.println("*****************");
		VW vw = new VW();
		vw.tyre();
		vw.specification();

	}

}
