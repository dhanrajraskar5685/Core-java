package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dtest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));

		Employee e5 = (Employee) in.readObject();
		Employee e6 = (Employee) in.readObject();
		System.out.println(e5.id + " " + e5.name + " " + e5.dept.did + " " + e5.dept.name);
		System.out.println(e6.id + " " + e6.name + " " + e6.dept.did + " " + e6.dept.name);
		System.out.println(e5);
		System.out.println(e6);
	}

}
