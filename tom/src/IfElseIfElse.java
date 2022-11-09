import java.util.Scanner;

public class IfElseIfElse
{
	public static void main( String[] args) {
		System.out.println("Main method Started");
		IfElseIfElse ifelseifelse= new IfElseIfElse();
		ifelseifelse.m1();
		System.out.println("Main method complete");
	}
	public  void  m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" print the value ");
		 int a = sc.nextInt();
if(a ==30) {
	System.out.println(" a is exact 30");
}

  else if (a==13) {
   	  System.out.println(" a is exact 13");
   }else if (a==15) {
  	 System.out.println(" a is exact 15");}

  else {
 	    System.out.println(" a is not found");
      
}}}

	



