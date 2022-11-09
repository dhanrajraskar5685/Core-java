package Exception2;

public class ReturnType {

	

		public static int m1() {
			System.out.println(".....m1 method.... ");
			try {
				System.out.println("Try block");
				int c=10/2;
				System.out.println("value of c :"+c);
				return c;
			} catch (Exception e) {
				// TODO: handle exception
				return 10;
				
			}finally {
				
				return 20; // override value print 
				
			}
			
			
			
			
		
		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(m1());
		}
		
	

}
