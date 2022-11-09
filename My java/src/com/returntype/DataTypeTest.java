package com.returntype;

public class DataTypeTest {

	int i = 10;
	String name = "hjk";
	String address = "pune";
	boolean b;
	int j;
	long l = 123456;

	public int addition() {

		int a = 10;
		int b = 20;
		int sum = a + b;

		return sum;

	}
	
	
	public static void main(String[] args) {

		DataTypeTest dt = new DataTypeTest();
		int i = dt.addition(); // use for return type method
		System.out.println( "int value  i:" +dt.i);
		System.out.println( "name:" +dt.name);
		System.out.println("address:" +dt.address);
		System.out.println("int value j:"+dt.j);
		System.out.println( "boolean Status:"+dt.b);
		System.out.println(dt.l);
		System.out.println(i);
	}

}
