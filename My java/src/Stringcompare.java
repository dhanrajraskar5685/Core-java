
public class Stringcompare {
	public static void main(String[] args) {
		
		String s = "Java";
		
		String s1 = "Java";
		
		String s2= new String("Java");
		// compare only contant 
		System.out.println(s.equals(s1)); 
		System.out.println(s.equals(s2));
		System.out.println("********************");
		// referance ,addresss different  
		String s3= new String("Java");
		
		String s4= new String("Java");
		System.out.println(s3==s4);
		
		
		String w="Dhanraj";
		String w1="DHANRAj"	;	
		System.out.println(w.equalsIgnoreCase(w1));
		
		
	}

}
