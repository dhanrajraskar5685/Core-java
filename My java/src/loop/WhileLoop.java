package loop;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method Started ");
int i = 1;
int sum=0;
while(i<=10) {
	
	//System.out.println(" inside while loop");
	sum=addition(sum,i);
	i++;
}
System.out.println("sum is:" +sum);


	}

	private static int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
