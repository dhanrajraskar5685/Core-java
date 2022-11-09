package Interface;

public class Ktest implements k, K2 { 

	@Override
	public void show() {
		System.out.println("show method");

	}

	public static void main(String[] args) {

		k k1 = new Ktest();
		k1.show();
		System.out.println("****we also print*****");
		Ktest kt = new Ktest();
		kt.show();

	}

}
