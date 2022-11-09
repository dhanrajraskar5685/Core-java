package BLOCKTEST;

public class Block {

	static {
		System.out.println("****static block ********");
		int i = 10;
		String name = "xyz";
		System.out.println(i);
		System.out.println(name);
	}

	{
		System.out.println("*****non static *********");
		int j = 12;
		String name = "xyz";
		System.out.println(j);
		System.out.println(name);
	}

	public Block() {
		System.out.println("***Default Block*****");

	}

	public void m1() {
		System.out.println("***m1 method*** ");
		int k = 12;
		String name = "xyz";
		System.out.println(k);
		System.out.println(name);

	}

	public static void main(String[] args) {
		int i = 200;
		//System.out.println("*** Main method ***");
		
		Block b = new Block();
		b.m1();
		System.out.println(i);
		//System.out.println("*** Main method ***");
		System.out.println(i);
	}

}
