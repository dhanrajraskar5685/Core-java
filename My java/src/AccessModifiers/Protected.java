package AccessModifiers;

public class Protected {

	protected int id = 20;
	protected String name = "XYZ"; // data member, method ,const
									// witin class ,within package ,
									// outside package p-c reln ,child class object

	protected void m1() {

		System.out.println(" m1 protected ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Protected pr = new Protected();
		System.out.println(pr.id);
		System.out.println(pr.name);
		pr.m1();
	}

}
