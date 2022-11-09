package inheritance;

public class R extends Q {

	int k = 13;

	public void m3() {
		System.out.println("m3 method for class R");
	}

	public static void main(String[] args) {

		P p = new P();
		System.out.println(p.i);
		p.m1();
		System.out.println("****************");
		Q q = new Q();
		System.out.println(q.i);
		System.out.println(q.j);
		q.m1();
		q.m2();

		System.out.println("*************************");
		R r = new R();
		System.out.println(r.i);
		System.out.println(r.j);
		System.out.println(r.k);
		r.m1();
		r.m2();
		r.m3();
	}

}
