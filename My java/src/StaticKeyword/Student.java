package StaticKeyword;

public class Student {

	int sid;
	static int id = 100;
	String name;
	static String collegeName = "Dyp";

	static {
		System.out.println("m1 method static ");
	}

	public static void m2() {
		int sid = 101;
		String name = "raj";
		System.out.println(sid);
		System.out.println(name);

	}

	public void m3() {
		System.out.println(id);

		System.out.println(collegeName);
	}

	public static void main(String[] args) {

		Student s = new Student();
		s.sid = 100;
		s.name = "Akshay";
		System.out.println(s.sid + " " + s.name + " " + Student.collegeName);

		Student s1 = new Student();
		s1.sid = 102;
		s1.name = "Akash";
		s1.collegeName = "MITaoe";

		System.out.println(s1.sid + " " + s1.name + " " + s1.collegeName);

		Student s2 = new Student();
		s2.sid = 104;
		s2.name = "Ak";

		System.out.println(s2.sid + " " + s2.name + " " + s2.collegeName);
		m2();
		s.m3();
	}
}