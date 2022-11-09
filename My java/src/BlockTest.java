
public class BlockTest {
	
	public BlockTest() {

		System.out.println("...default construtor...");
		// TODO Auto-generated constructor stub
	}

	public void m1() {
		System.out.println("..m1 method of blocktest class..");

	}

	{
		
		System.out.println("..non static block..");
	}

	public void m2() {

		System.out.println("..m2 method..");
	}

	static {

		System.out.println("...static block...");

	}

	public static void main(String[] args) {

		BlockTest t = new BlockTest();
		t.m1();
//		t.m2();
		int i = 10;
		System.out.println(i);
	}

}
