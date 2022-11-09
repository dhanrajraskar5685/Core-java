package Aggregation;

public class Test {

	public static void main(String[] args) {
		Address adr = new Address("Nigdi", "Pune", "412403");
		Student s = new Student(101, " Dhanraj", "DYP", adr);
		Student s1 = new Student(102, "Dhanashree", "Dyp", adr);

		System.out.println(s.id + " " + s.name + " " + " " + s.collegeName + " " + s.address.ladr + " " + s.address.pdar
				+ " " + s.address.pincode);
		System.out.println(s1.id + " " + s1.name + " " + s1.collegeName + " " + s1.address.ladr + " " + s.address.pdar
				+ " " + s1.address.pincode);
		// TODO Auto-generated method stub

	}

}
