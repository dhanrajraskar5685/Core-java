package parametermethodexample;

public class Demo {
	public Demo() {
		System.out.println("**********************");
		System.out.println("Default constant");
	}

	public Demo(int i) {
		System.out.println("**********************");
		System.out.println("Single paramter const");
		System.out.println(i);
	}

	public Demo(String s, int k) {
		System.out.println("**********************");
		System.out.println("double parameter const");
		System.out.println(s + "" + k);
	}

	public Demo(Student s, char c, boolean b) {
		System.out.println("**********************");
		System.out.println("Three parameter const");
		System.out.println(s.id + " " + s.name + " " + s.address);
		System.out.println(c);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo(30);
		Demo d2 = new Demo("zxc", 55);
		Student s = new Student();
		s.id = 101;
		s.name = "lmo";
		s.address = "pmc";
		Demo d3 = new Demo(s, 'p', true);    
	}
}
