package StaticKeyword;

public class StaticExercise1 {
	int i=10;
	String name="pcmc";
	
	
	public static  void m1() {
		StaticExercise1 s= new StaticExercise1();
		System.out.println(s.i);
		System.out.println(s.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		
	}

}
