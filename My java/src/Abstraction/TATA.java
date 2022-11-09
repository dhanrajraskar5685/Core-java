package Abstraction;

public class TATA extends Vehicle {

	@Override
	public void specification() {
		// TODO Auto-generated method stub
		System.out.println("TATA specification");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new TATA();
		v.tyre();
		v.specification();

	}

}
