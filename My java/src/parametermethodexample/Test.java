package parametermethodexample;

public class Test {
	public void m1() {
		System.out.println("**********************");
		System.out.println("without parameter method");
	}

	public void m2(int i) {
		System.out.println("**********************");
		System.out.println(" singel parameter with int ");
		System.out.println(" m2 method i value :" + i);
	}

	public void m3(String s, int j) {
		System.out.println("**********************");
		System.out.println(" double paramete method");
		System.out.println(s + " " + j);
	}

	public void m4(char c, boolean b, long l) {
		System.out.println("**********************");
		System.out.println("paramter Method");
		System.out.println(c + " " + b + " " + l);
	}

	public int m5(String s) {
		System.out.println("**********************");
		System.out.println(s);
		return 10;
	}

	public void addStudentDetails(Student s) {
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.address);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2(50);
		t.m3("ABC", 20);
		t.m4('C', true, 123456);
		int i = t.m5("Dhanraj");
		System.out.println(i);
		System.out.println("**********************");
		Student student = new Student();
		student.id = 101;
		student.name = "radha";
		student.address = "pune";
		t.addStudentDetails(student);
	}

}

