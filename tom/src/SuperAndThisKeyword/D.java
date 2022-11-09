package SuperAndThisKeyword;
public class D extends C {


			public D() {
				this(true, 'c', 10);
				System.out.println("default parameter in clas D");

			}

			public D(boolean b, char c, int i) {
				this(false);
				System.out.println("three parameter in clas D");

			}

			public D(boolean b) {
				this(10);
				System.out.println("boolean b");

			}

			public D(int i) {
				super(10, 15);
				System.out.println( "int i value print");

			}

			public static void main(String[] args) {
				D d = new D();
				// TODO Auto-generated method stub
			}

		}


	


