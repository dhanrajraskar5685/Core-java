package Aggregation;

public class Test {
	public static void main(String[] args) {

		State s1 = new State();
		s1.setStateid(15698);
		s1.setStatename("Maharashtra");
		s1.setCountryname("India");

		City c1 = new City();
		c1.setMH(12);
		c1.setCityname("Pune");
		c1.setFamousplace("Shanivarwada");
		c1.setS(s1);
		City c2 = new City();
		c2.setMH(14);
		c2.setCityname("Pimpri");
		c2.setFamousplace("Morya Gosavi");
		c2.setS(s1);
		City c3 = new City();

		c3.setMH(16);
		c3.setCityname("Ahmadnagar");
		c3.setFamousplace("Harischandragad");
		c3.setS(s1);

		System.out.println(c1.MH + " " + c1.cityname + " " + c1.famousplace + " " + c1.s.Stateid + " " + c1.s.statename
				+ " " + c1.s.countryname);
		System.out.println(c2.MH + " " + c2.cityname + " " + c2.famousplace + " " + c2.s.Stateid + " " + c2.s.statename
				+ " " + c2.s.countryname);
		System.out.println(c3.MH + " " + c3.cityname + " " + c3.famousplace + " " + c3.s.Stateid + " " + c3.s.statename
				+ " " + c3.s.countryname);
	}
}