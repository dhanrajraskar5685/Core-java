package String;

public class string1 {
	public static void main(String[] args) {
		
		// example for string storage 
		// ( String s="yasharj";)liter object go to constant pull area (cpa)
		//( String s1= new String ("java");)new key word object go to heap area 
		String s1= new String ("java");
		
		System.out.println(s1);
	s1=s1.concat(" Dhanraj");
	System.out.println(s1); 
		s1=s1.concat(" Vasudeo");
		s1=s1.concat(" Raskar ");
		System.out.println(s1);
		String s="yasharj";
		System.out.println(s);
		  s=s.concat(" Vasudeo");
		System.out.println(s);
		s=s.concat(" Raskar");
		System.out.println(s);
	}

}
