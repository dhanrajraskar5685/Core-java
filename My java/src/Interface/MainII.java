package Interface;

public class MainII implements II4 {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(" II1 interface Method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(" II2 interface Method");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println(" II3 interface Method");

	}

	public static void main(String[] args) {
		II2 i = new MainII();
		System.out.println(i.i);
		i.m1();
		System.out.println("**********************");
		II3 i1 = new MainII();
		System.out.println(i1.i);
		System.out.println(i1.j);
		i1.m1();
		i1.m2();
		System.out.println("*****************");
		MainII i3 = new MainII();
		System.out.println(i3.i);
		System.out.println(i3.j);
		System.out.println(i3.k);
		i3.m1();
		i3.m2();
		i3.m3();

	}
}
