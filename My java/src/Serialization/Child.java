package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Child extends Parent {

	String address;
	String pincode;

	public Child(int id, String name, String address, String pincode) {
		super(id, name);
		this.address = address;
		this.pincode = pincode;
	}

	public static void main(String[] args) throws IOException {
		Child c1 = new Child(101, "Dhanraj", "pune", "412403");
		Child c2 = new Child(102, "Dhanashri ", "pcmc ", "412405");

		FileOutputStream fio = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fio);
		out.writeObject(c1);
		out.writeObject(c2);
		out.close();
		System.out.println("sucessfull");
	}

}
