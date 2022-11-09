package Exception2;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//String s = args[0];//ArrayIndexOutOfBoundsException
			//System.out.println(s);
			int i = 10/0;
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("**************");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}

	}

}
