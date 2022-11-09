package Accessmodifier1;

import Accessmodifier.A;

public class B extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();

		A a = new A();
		System.out.println("Acess public :" + b.k);
//System.out.println(a.i);
//System.out.println(a.j);

		System.out.println("Acess protected:" + b.l);
	}

}
