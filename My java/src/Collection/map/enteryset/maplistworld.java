package Collection.map.enteryset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class maplistworld {
	public Map<String, Map<String, List<String>>> addworld() {

		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pimpri");
		maharashtra.add("Nagpur");
		maharashtra.add("sagali");

		List<String> gujrat = new ArrayList<String>();
		gujrat.add("kacha");
		gujrat.add("vapi ");
		gujrat.add("Surat ");

		Map<String, List<String>> india = new HashMap<String, List<String>>();
		india.put("GUJRAT", gujrat);
		india.put("MAHARASHTRA", maharashtra);

		List<String> Washington = new ArrayList<String>();
		Washington.add("Seattle");
		Washington.add("Spokane");
		Washington.add("Tacoma");

		List<String> Texas = new ArrayList<String>();
		Texas.add("Abbott");
		Texas.add("Abernathy ");
		Texas.add("Abilene");

		Map<String, List<String>> usa = new HashMap<String, List<String>>();
		usa.put("WASHINGTON", Washington);
		usa.put("TEXAS", Texas);

		Map<String, Map<String, List<String>>> world = new HashMap<String, Map<String, List<String>>>();
		world.put("INDIA", india);
		world.put("USA", usa);
		return world;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maplistworld mw = new maplistworld();
		Map<String, Map<String, List<String>>> wmap = mw.addworld();
		Set<String> setOfCountries = wmap.keySet();

		System.out.println("========iterator ==========");
		Iterator<String> itr = setOfCountries.iterator();
		while (itr.hasNext()) {
			String country = itr.next();
			System.out.println(country);

			Map<String, List<String>> cMap = wmap.get(country);
			Set<String> states = cMap.keySet();
			Iterator<String> itr2 = states.iterator();
			while (itr2.hasNext()) {
				String state = itr2.next();
				System.out.println(state);

				List<String> cities = cMap.get(state);
				Iterator<String> itr3 = cities.iterator();
				while (itr3.hasNext()) {
					String city = itr3.next();
					System.out.println(city);
				}

			}

		}
		System.out.println(" ===== for each=========== ");

		for (String countries : setOfCountries) {
			Map<String, List<String>> listof = wmap.get(countries);
			Set<String> set1 = listof.keySet();
			System.out.println(set1);
			for (String country : set1) {
				System.out.println(country);
				List<String> set2 = listof.get(country);

				for (String city1 : set2) {
					System.out.println(city1);
				}
			}

		}

	}
}
