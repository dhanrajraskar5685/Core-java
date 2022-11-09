package Serialization;

import java.io.Serializable;

public class Dept implements Serializable {

	int did;
	String name;

	public Dept(int did, String name) {

		this.did = did;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", name=" + name + "]";
	}

}
