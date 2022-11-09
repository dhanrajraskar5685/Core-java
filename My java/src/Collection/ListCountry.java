package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCountry {

	public List<List<String>> addstate() {

		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("nashik");
		maharashtra.add("mumbai");

		List<String> gujrat = new ArrayList<String>();
		gujrat.add("vapi");
		gujrat.add("gandhinagar");
		gujrat.add("ahmadabad");

		List<List<String>> india = new ArrayList<List<String>>();
		india.add(maharashtra);
		india.add(gujrat);
		return india;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListCountry country = new ListCountry();
		List<List<String>> india = country.addstate();
		System.out.println(india);
		System.out.println("***iteretor interface***");
		Iterator<List<String>> itr = india.iterator();
		while (itr.hasNext()) {
			List<String> state = itr.next();
			System.out.println(state);

			Iterator<String> itr2 = state.iterator();

			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
		System.out.println("***each loop****");
		System.out.println("*****STATE***********");
		for (List<String> statelist : india) {
			System.out.println("****CITY****");
			for (String cities : statelist) {

				System.out.println(cities);
			}
		}

	}

}
