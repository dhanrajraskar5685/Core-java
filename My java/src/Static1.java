
public class 

Static1 {
	// static

	static int a = 10;
	static String name = "dhanraj";

	// global

	int b = 20;
	public String collage = "mit";

	public void localdata() {
		int d = 30;
		String Q = "pune";
		System.out.println(d);// local define as...( name)
		System.out.println(Q);
	}

	public static void main(String[] args) {
		Static1 s = new Static1();
		System.out.println(Static1.a);// static define as ...(class name.static name)
		System.out.println(Static1.name);
		System.out.println(s.b);// global define as ... make object creation then( object name. public name )
		System.out.println(s.collage);

		s.localdata();
	}

}
