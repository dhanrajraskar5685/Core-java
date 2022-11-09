package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {
		Student s = new Student(101, "Dhanraj", "pune");
		Student s1 = new Student(102, "Dhanashree", "pcmc");
		FileOutputStream fio = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fio);
		out.writeObject(s);
		out.writeObject(s1);
		out.close();
	}

}
