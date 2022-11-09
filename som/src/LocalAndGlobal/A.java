package LocalAndGlobal;

public class A {
	int i=10;
	String name = "abc";

	void show() {
		int j = 10;
		int z = i + j;
		String name = "xyz";
		System.out.println(i + " " + j + " " + ++i + " " + ++j);
		System.out.println(name);
		System.out.println(z);
	}

	void show1() {
		int j = 12;
		int z = i + j;
		String name = "xyz";
		System.out.println(i + " " + j + " " + ++i + " " + ++j);
		System.out.println(name);
		System.out.println(z);
		System.out.println();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.i);
		System.out.println(a.name);
		a.show();
		
		a.show();
		
		a.show();
	}

}
