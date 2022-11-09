package Serialization;

import java.io.Serializable;

public class parent implements Serializable {
	int id;
	String name;

	public parent(int id, String name) {

		this.id = id;
		this.name = name;
	}

}
