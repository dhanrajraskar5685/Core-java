package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dchild {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));
		Child c1 = (Child) in.readObject();
		Child c2 = (Child) in.readObject();
		System.out.println(c1.id + " " + c1.name + " " + c1.address + " " + c1.pincode);
		System.out.println(c2.id + " " + c2.name + " " + c1.address + " " + c1.pincode);
	}

}
