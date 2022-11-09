package inheritance2;

public class LogicCDE {

	public static void main(String[] args) {

		System.out.println("******Class C result******* ");
		C c = new C();
		System.out.println(c.c);
		c.m1();
		c.m2();
		System.out.println("******Class D result******* ");
		D d = new D();
		System.out.println(d.c);
		System.out.println(d.d);
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		System.out.println("******Class E result******* ");
		E e = new E();
		System.out.println(e.c);
		System.out.println(e.d);
		System.out.println(e.e);
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		e.m5();
		System.out.println("****** mix result of c and D class*****");
		C c1 = new D();
		System.out.println(c1.c);
		c1.m1();
		c1.m2();
		System.out.println("****** mix result of D and E class*****");
		D d1 = new E();
		System.out.println(d1.c);
		System.out.println(d1.d);
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
		
	}

}
