package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dchild {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	ObjectInputStream in = new ObjectInputStream( new FileInputStream("output.txt"));
		child c1 = (child) in.readObject();
		System.out.println(c1.id + " " + c1.name + " " + c1.Address);
	}

}
