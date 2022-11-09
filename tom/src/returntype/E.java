package returntype;

public class E {
	int x,y,z;
	public int m1()
	{
		E e = new E();
		System.out.println(e.x);// 0
		System.out.println(e.y);// 0
		System.out.println(e.z);// 0
		e.x = 10;
		e.y= 20;
		e.z=30;
		return e.z;
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("..main method ..");
E e = new E();
int i = e.m1();
System.out.println(i);
	}

}
