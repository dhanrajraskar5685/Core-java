package com.returntype;

public class D {
	int x;

	public D m1() {
		D d = new D();
		d.x = 20;

		return d;

	}

	public static void main(String[] args) {

		D d = new D();

		System.out.println(d.x);
		D d2 = d.m1();
		System.out.println(d2.x);
	}

}
