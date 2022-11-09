package parametermethod1;
public class ParameterMethod {
	public void m1() {
		System.out.println(" m1 single Method");
	}
    public void m2(int x) {
		System.out.println("m2 method value: " + x);
	}
public void m3(String s, int y, boolean b) {

		System.out.println(s + " " + y + " " + b);
	}
public void addstudent(Student1 s) {
		System.out.println(s.id + " " + s.name + " " + s.address);
}
public int m4(String s) {
		System.out.println(s);
		return 70;
	}
public static void main(String[] args) {
		ParameterMethod p = new ParameterMethod();
		p.m1();
		p.m2(101);
		p.m3("Dj", 56, true);
		Student1 s = new Student1();
		p.addstudent(s);
		int k = p.m4("xyz");
		System.out.println(k);
	}

}
