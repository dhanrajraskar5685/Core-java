package AccessModifiers;

public class Testclass {

	public static void main(String[] args) {
		System.out.println(" default class result ");
		DefaultTest d = new DefaultTest();
		System.out.println(d.id);
		System.out.println(d.name);
		d.m1();

		System.out.println(" ********protected class resuly******");
		Protected pr = new Protected();
		System.out.println(pr.id);
		System.out.println(pr.name);
		pr.m1();
	}
}
