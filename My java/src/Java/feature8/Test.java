package Java.feature8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunctionInterface m = (int x, int y) -> x * y;
		int y1 = m.calculate(10, 20);
		System.out.println("Multiplication" + y1);
		m = (int x, int y) -> x + y;
		int k = m.calculate(10, 20);
		System.out.println("Addition" + k);
//		MyFunctionInterface	m=(x)-> System.out.println(x);
//	m.calculate(12);
	}

}
