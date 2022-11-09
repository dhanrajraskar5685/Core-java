
public class LocalAndGlobal {
	static int k;

		
	
	
	int i=10;
	
	
	 public void m1() {
		  int j=10;
		  
		 // int z=i+j;
		  System.out.println("int i;"+i+" " + ++i );
			  System.out.println( "int j:"+j+ " " + ++j);
			//  System.out.println( "int z:"+z);
			  
		  
		 // System.out.println( "int j;"+ ++j );
		 
	 }
	
	int z1 = i+k;
	

	public static void main(String[] dhanraj) {
		// TODO Auto-generated method stub
		LocalAndGlobal l =  new LocalAndGlobal();
		System.out.println( "int i:"  +l.i);
		System.out.println("int z1:" +l.z1);
		
		
		l.m1();
		System.out.println("**************");
		
		l.m1();
	// System.out.println(k+" "+ ++k);

	}

}
