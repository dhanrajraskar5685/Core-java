package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	 int id;
	 String name;
	 String address ;
	public Student(int id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	 
	

}
