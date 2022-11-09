package String;

public class StratwithAndEndwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The Java String class startsWith() method checks if this string starts with
		// the given prefix.
		// It returns true if this string starts with the given prefix; else returns
		// false.
System.out.println("****start with*****");
		String s = "indian is my country";

		System.out.println(s.startsWith("indian"));

		System.out.println(s.startsWith("indian is "));

		System.out.println(s.startsWith("inDian is "));

		System.out.println("****end with*****");
		// The Java String class endsWith() method checks if this string ends with a given suffix.
		//It returns true if this string ends with the given suffix; else returns false.
		
		System.out.println(s.endsWith("country"));
		System.out.println(s.endsWith("counTry"));
		
	}

}
