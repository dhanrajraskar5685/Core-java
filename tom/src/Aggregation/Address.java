package Aggregation;

public class Address {

	String statename;
	String countryname;

	public Address(String statename, String countryname) {

		this.statename = statename;
		this.countryname = countryname;
		
	}

	@Override
	public String toString() {
		return "Address [statename=" + statename + ", countryname=" + countryname + "]";
	}

}
