package Interface;

public class Ilogic implements I1 {

	public static void main(String[] args) {

		System.out.println(I1.i);
		System.out.println(Ilogic.i);
		System.out.println(i);
		Ilogic i = new Ilogic();
		System.out.println(i.i);
		I1 i1 = new Ilogic();
		System.out.println(i1.i);//// 5 way to call this method

	}
}
