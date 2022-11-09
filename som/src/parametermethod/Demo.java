package parametermethod;

public class Demo {

	public Demo() {

		System.out.println("******* No parameter*********");
	}

	public Demo(int x) {
		System.out.println("******* Single parameter*********");
		System.out.println(x);
	}

	public Demo(int x, int y) {
		System.out.println("******* Double parameter*********");
		System.out.println(x);
		System.out.println(y);
	}

	public Demo(String name, int x, int y) {
		System.out.println("******* Triple parameter*********");
		System.out.println(name);
		System.out.println(x);
		System.out.println(y);
	}

	public Demo(Student s) {
		System.out.println("******* Student class parameter*********");
		System.out.println(s.i + " " + s.name + " " + s.address);
	}

	public static void main(String[] args) {
		int a = 20, b = 50;
		String name = "DHANRAJ";
		Demo d = new Demo();
		Demo d1 = new Demo(a);
		Demo d2 = new Demo(a, b);
		Demo d3 = new Demo(name, a, b);

		Student s = new Student();
		Demo d4 = new Demo(s);
	}

}
