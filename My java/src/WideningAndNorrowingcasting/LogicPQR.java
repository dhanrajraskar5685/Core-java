package WideningAndNorrowingcasting;

public class LogicPQR {

	public Pc testmethod() {

		// P p = new P();
	//	Q q = new Q();
		R r = new R();
		return r;

	}

	public static void main(String[] args) {
		LogicPQR pq = new LogicPQR();

		R r1 = (R) pq.testmethod();
		System.out.println(r1.x);
		System.out.println(r1.y);
		System.out.println(r1.z);

		r1.m1();
		r1.m2();
		r1.m3();
	}

}
