package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dpersist {

	public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
ObjectInputStream in =   new ObjectInputStream(new FileInputStream("output.txt") );
Student s = (Student)in.readObject();
Student s1 = (Student)in.readObject();
System.out.println( s.id+" " + s.name+" "+s.address);
System.out.println( s1.id+" " + s1.name+" "+s1.address);
	}

}
