package SuperAndThiskeyword;

public class D extends CE {
	
 

	public D() {
		this(true, 'c', 10);
		System.out.println(666);

	}

	public D(boolean b, char c, int i) {
		this("abc");
		System.out.println(999);

	}

	public D(String string) {
		this(10);
		System.out.println(333);

	}

	public D(int i) {
		super(10, true);
		System.out.println(444);

	}

	public static void main(String[] args) {
		D d = new D();
		// TODO Auto-generated method stub
	}

}



