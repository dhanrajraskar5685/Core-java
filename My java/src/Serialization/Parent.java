package Serialization;

import java.io.Serializable;

public class Parent implements Serializable {
	int id;
	String name;

	public Parent(int id, String name) {

		this.id = id;
		this.name = name;
	}

}
