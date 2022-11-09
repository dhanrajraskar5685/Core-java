package String;

public class repalace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The Java String class replace() method returns
		// a string replacing all the old char or CharSequence to new char or
		// CharSequence.

		String s = "Exponent is  best class in india";

		String k = s.replace('i', 'z');
		System.out.println(k);
		System.out.println("********* replaceall************");
		
	String k1	=s.replaceAll(" best","good");
System.out.println(k1);
	}

}
