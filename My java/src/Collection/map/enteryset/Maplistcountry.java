package Collection.map.enteryset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Maplistcountry {

	public Map<String, List<String>> addcountry() {

		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("nashik");
		maharashtra.add("mumbai");

		List<String> gujrat = new ArrayList<String>();
		gujrat.add("vapi");
		gujrat.add("gandhinagar");
		gujrat.add("ahmadabad");

		Map<String, List<String>> india = new HashMap<String, List<String>>();
		india.put("Maharashtra", maharashtra);
		india.put("Gujrat", gujrat);
		return india;

	}

	public static void main(String[] args) {

		Maplistcountry map = new Maplistcountry();
		Map<String, List<String>> india = map.addcountry();
		Set<String> set = india.keySet();
		System.out.println(" =====iterator=====");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String state = itr.next();
			System.out.println(state);
			List<String> listof = india.get(state);
			Iterator<String> itr2 = listof.iterator();
			while (itr2.hasNext()) {

				System.out.println(itr2.next());
			}
		}
		System.out.println("===== For each=====");

		for (String s : set) {
			List<String> listof = india.get(s);

			for (String city : listof) {
				System.out.println(city);
			}
		}

	}

}
