package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class child extends parent {

	public child(int id, String name, String address) {
		super(id, name);
		Address = address;
	}

	String Address;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method
		child c = new child(101, "Raj", "pune");
		FileOutputStream fio = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fio);
		out.writeObject(c);
		out.close();
		System.out.println(" successfull");
	}

}
