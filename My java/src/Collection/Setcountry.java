package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setcountry {

	public Set<Set<String>> addstate() {

		Set<String> maharashtra = new HashSet<String>();
		maharashtra.add("pune");
		maharashtra.add("nashik");
		maharashtra.add("mumbai");

		Set<String> gujrat = new HashSet<String>();
		gujrat.add("vapi");
		gujrat.add("gandhinagar");
		gujrat.add("ahmadabad");

		Set<Set<String>> india = new HashSet<Set<String>>();
		india.add(maharashtra);
		india.add(gujrat);
		return india;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setcountry country = new Setcountry();
		Set<Set<String>> india = country.addstate();
		System.out.println(india);
		System.out.println("***iteretor interface***");
		Iterator<Set<String>> itr = india.iterator();
		while (itr.hasNext()) {
			Set<String> state = itr.next();
			System.out.println(state);

			Iterator<String> itr2 = state.iterator();

			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
		System.out.println("***each loop****");
		for (Set<String> statelist : india) {
			for (String cities : statelist) {

				System.out.println(cities);
			}
		}

	}

}
