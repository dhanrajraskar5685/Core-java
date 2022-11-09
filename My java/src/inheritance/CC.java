package inheritance;

public class CC extends AA {
	int k = 40;

	public void m3() {

		System.out.println("m3 method of class CC");
	}
		public static void main(String[] args) {
		CC c = new CC();
		System.out.println(c.i);
		System.out.println(c.k);
		c.m1();
		c.m3();

	}
}
