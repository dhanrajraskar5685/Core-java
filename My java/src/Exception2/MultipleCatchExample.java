package Exception2;

public class MultipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		System.out.println("..Main method inside..");
		String s = args[0];
		System.out.println("Value of s:"+s);
		int i = Integer.parseInt(s);
		int j =10/i;
		System.out.println("value of j:"+j);
		String s1=null;
		System.out.println(s1.length());
		// follow sub to super 
		
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException handel ");
			System.out.println(e);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException handle");
			System.out.println(e);
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointerException handle");
			System.out.println(e);
		}
	}
}
