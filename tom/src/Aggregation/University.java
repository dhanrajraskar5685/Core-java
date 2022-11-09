package Aggregation;

public class University {
	int Uid;
	String name;
	String address;

	public University(int uid, String name, String address) {

		Uid = uid;
		this.name = name;
		this.address = address;
		
	}

	@Override
	public String toString() {
		return "University [Uid=" + Uid + ", name=" + name + ", address=" + address + "]";
	}

}