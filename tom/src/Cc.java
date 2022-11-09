
public class Cc {

	public int m1() {
		int x = 10;
		int y = 20;
		int z = x + y;
		return x + y;

	}

	public static void main(String[] args) {
		Cc c = new Cc();
		int i = c.m1();
		System.out.println(i);

	}

}
