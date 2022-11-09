package Block;

public class A {

	{
		System.out.println("*********non static **********");
		int id = 50;
		String name = "efg";
		System.out.println(id);
		System.out.println(name);
	}

	static {
		System.out.println("***********static Method**********");
		int x = 100;
		String name = "dhanraj";
		System.out.println(x);
		System.out.println(name);
	}

	public void m1() {
		int i = 10;
		String name = "xyz";
		System.out.println("m1 method of A class");
		System.out.println(i);
		System.out.println(name);
	}

	public A() {
		System.out.println("**********default***************");
		int aid = 156;
		String name = "raj";
		System.out.println(aid);
		System.out.println(name);
	}

	{
		int i = 155;
		String name = "lpo";
		System.out.println(i);
		System.out.println(name);
	}
}


