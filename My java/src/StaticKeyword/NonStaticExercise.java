package StaticKeyword;

public class NonStaticExercise {
	static int j = 101;
	static String name = "sadhana";

	public void m2() {
		System.out.println(j);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticExercise n = new NonStaticExercise();
		n.m2();
	}

}
