package Abstraction;

public class Imain implements I {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(" m1 implemented method in main");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(" m2implemented method in main");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i = new Imain();
		System.out.println(i);
		System.out.println(j);
		i.m1();
		i.m2();
		System.out.println("***************************");
		Imain main = new Imain();
		System.out.println(i);
		System.out.println(j);
		main.m1();
		main.m2();
	}

}
