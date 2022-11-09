package Aggregation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address adr = new Address("Maharashtra", "India");
		University u = new University(101, "sppu", "pune");
		College1 c1 = new College1(11, "MIT", "KOTHRUD", u, adr);
		College1 c2 = new College1(22, "Modern", "FcROAD", u, adr);
		College1 c3 = new College1(33, "Jspm", "NAHRE", u, adr);

		System.out.println(c1.cid + " " + c1.collegeName + " " + c1.collegeAddress + " " + c1.u.Uid + " " + c1.u.name
				+ "" + " " + c1.u.address + " " + c1.adr.statename + " " + c1.adr.countryname);
		System.out.println(c2.cid + " " + c2.collegeName + " " + c2.collegeAddress + " " + c2.u.Uid + " " + c2.u.name
				+ "" + " " + c2.u.address + " " + c2.adr.statename + " " + c2.adr.countryname);
		System.out.println(c3.cid + " " + c3.collegeName + " " + c3.collegeAddress + " " + c3.u.Uid + " " + c3.u.name
				+ "" + " " + c3.u.address + " " + c3.adr.statename + " " + c3.adr.countryname);

		//System.out.println(c1.toString());// Using Tostring method
	}

}
