package String;

public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "DHANRAJ";
		String name1 = "RASKAR";
		String sf1 = String.format(" My name is %s %s", name, name1);
		String sf2 = String.format("value is %f", 32.33434);
		String sf3 = String.format("value is %32.12f", 32.33434);// returns 12 char fractional part filling with 0

		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
		System.out.println("*******************************");
		System.out.printf("%d\n", 10 );

		System.out.printf("%f\n", 12.10);
		System.out.printf("%s\n", "dh");
		System.out.printf("%c\n", 'c');
		System.out.printf("%S\n", "dh");
		System.out.printf("%C\n", 'c');
		System.out.printf("%b\n", 4>5);
		System.out.printf("%e\n", 10.102);
		System.out.printf("%E\n", 10.102);
		System.out.printf("%g\n", 10.102);
		System.out.printf("%G\n", 10.102);
		System.out.println("*****************************");
		
		
		double n = 10.23556698774;
		System.out.printf("%f%n",n);
		System.out.printf("%f%n",n);
	}
}
