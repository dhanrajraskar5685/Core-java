package Accessmodifier;

public class A {

	private int i = 12;
	int j = 16;
	public int k = 10;
	protected int l = 14;

	public void m1() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
		System.out.println(a.l);
	}

}
