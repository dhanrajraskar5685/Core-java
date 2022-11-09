package com.returntype;

public class B {

	public void m1() {
		System.out.println("m1 method of class");
	}

	public int m2() {

		return 10;
	}

	public String m3() {
		return "amol";
	}

	public double m4() {

		return 10.123;
	}

	public boolean m5() {
		return false;
	}

	public char m6() {
		return 'c';
	}

	public float m7() {
		return 89.09f;
	}

	public Student addStudent() {
		Student s = new Student();
		s.id = 10;
		s.name = "Test";
		return s;
	}

	public Employee addEmployeedetails() {
		Employee e = new Employee();
		e.id = 101;
		e.name = "nilesh";
		e.address = "pune";
		return e;

	}

	public static void main(String[] args) {
		B a = new B();
		a.m1();
		int j = a.m2();
		System.out.println(j);
		String s = a.m3();
		System.out.println(s);
		double d = a.m4();
		System.out.println(d);
		boolean b = a.m5();
		System.out.println(b);
		char c = a.m6();
		System.out.println(c);
		float f = a.m7();
		System.out.println(f);
		Student Student = a.addStudent();
		System.out.println(Student.id);
		System.out.println(Student.name);

		Employee e = a.addEmployeedetails();
		System.out.println(e.id);
		System.out.println(e.name);
	}

	{

	}

}