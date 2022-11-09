package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	Dept dept;

	public Employee(int id, String name, Dept dept) {

		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

}
