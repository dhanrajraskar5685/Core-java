package returntype;

public class D {
	int x; // 0
	int y = 10;

	public D m1() {

		D d = new D();
		d.x = 30;
		d.y = 50;
		int x = 10;
		int y = 40;
		d.x = y;
		x = d.y;// 50
		System.out.println(y); // 40
		System.out.println(d.x); // 40
		System.out.println(x); // 50
		System.out.println(d.y); // 50
		D d2 = new D();
		d2.x = d.x;

		return d2;
	}

	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.x); // 0
		System.out.println(d.y); // 10
		D d2 = d.m1();

		System.out.println(d2.x); // 50
		System.out.println(d2.y);// 40
	}
}
