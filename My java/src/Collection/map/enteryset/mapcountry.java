package Collection.map.enteryset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mapcountry {

	public Map<String, Map<String, Integer>> addcountry() {

		Map<String, Integer> maharashtra = new HashMap<String, Integer>();
		maharashtra.put("pune", 12);
		maharashtra.put("nashik", 15);
		maharashtra.put("mumbai", 03);

		Map<String, Integer> gujrat = new HashMap<String, Integer>();
		gujrat.put("vapi", 112);
		gujrat.put("gandhinagar", 115);
		gujrat.put("ahmadabad", 118);

		Map<String, Map<String, Integer>> india = new HashMap<String, Map<String, Integer>>();
		india.put("Maharashtra", maharashtra);
		india.put("Gujrat", gujrat);
		return india;
	}

	public static void main(String[] args) {
		mapcountry map = new mapcountry();
		Map<String, Map<String, Integer>> india = map.addcountry();
		Set<String> set = india.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String state = itr.next();
			System.out.println(state);
			Map<String, Integer> city = india.get(state);
			Set<String> map1 = city.keySet();
			Iterator<String> itr2 = map1.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
		System.out.println("====== for each===== ");

		for (String country : set) {
			System.out.println(country);
			Map<String, Integer> country1 = india.get(country);
			Set<String> set2 = country1.keySet();
			for (String city1 : set2) {
				System.out.println(city1 + "    " + country1.get(city1));

			}
		}
	}

}
