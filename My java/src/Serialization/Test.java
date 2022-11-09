package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Dept d = new Dept(1012, "comp");
		Employee e1 = new Employee(1, "Dhanraj", d);
		Employee e2 = new Employee(2, "Dhanashree", d);
		FileOutputStream fio = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fio);
		System.out.println("kkkk");
		out.writeObject(e1);
		out.writeObject(e2);
		out.close();
		System.out.println("Successfull...");

	}
}
