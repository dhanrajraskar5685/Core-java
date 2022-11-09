package Exception2;

import java.util.Scanner;

public class MainClass {
	//String atmpin;
	
	
	public  String validatepin () throws CustomException    {
		// TODO Auto-generated method stub
		String atmpin = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 4 digit Atmpin");
		try {
			
		atmpin = sc.next();
			
		} catch (Exception e) {
			// TODO: handle exception
			return validatepin ();
		}
		
		if (atmpin.equals("1234")) {
			System.out.println("txn successfully");
			return atmpin;
		}
		else 
			throw new CustomException ("you enter invalid atmpin");

		
		
		
		}
		
	

	
	
	
	public static void main(String[] args)  {
		 
	 MainClass mn = new  MainClass();
	
		
		try {
			mn.validatepin ();
		} catch ( CustomException e) {
			// TODO: handle exception
		}
	}	

}
