package Collection.map.enteryset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMapWorld {

	public Map<String, Map<String, Map<String, Integer>>> mapaddworld() {

		Map<String, Integer> maharashtra = new HashMap<String, Integer>();
		maharashtra.put("pimpri", 10111);
		maharashtra.put("Nagpur", 10222);
		maharashtra.put("sagali", 10333);

		Map<String, Integer> gujrat = new HashMap<String, Integer>();
		gujrat.put("kacha", 2222);
		gujrat.put("vapi ", 3333);
		gujrat.put("Surat ", 4444);

		Map<String, Map<String, Integer>> india = new HashMap<String, Map<String, Integer>>();
		india.put("GUJRAT", gujrat);
		india.put("MAHARASHTRA", maharashtra);

		Map<String, Integer> Washington = new HashMap<String, Integer>();
		Washington.put("Seattle", 7777);
		Washington.put("Spokane", 8888);
		Washington.put("Tacoma", 8987);
		Map<String, Integer> Texas = new HashMap<String, Integer>();
		Texas.put("Abbott", 1012);
		Texas.put("Abernathy", 589);
		Texas.put("Abilene", 8989);
		Map<String, Map<String, Integer>> usa = new HashMap<String, Map<String, Integer>>();
		usa.put("WASHINGTON", Washington);
		usa.put("TEXAS", Texas);
		Map<String, Map<String, Map<String, Integer>>> world = new HashMap<String, Map<String, Map<String, Integer>>>();
		world.put("INDIA", india);
		world.put("USA", usa);
		return world;
		//MAP(String,map(String,integer))
	}

	public static void main(String[] args) {
		MapMapWorld wm = new MapMapWorld();
		Map<String, Map<String, Map<String, Integer>>> wmap = wm.mapaddworld();

		System.out.println("========iterator ==========");

		Set<String> setOfCountries = wmap.keySet();
		Iterator<String> itr = setOfCountries.iterator();
		while (itr.hasNext()) {
			String country = itr.next();
			System.out.println("++++++++++++++++++");
			System.out.println("      " + country);// india

			Map<String, Map<String, Integer>> cMap = wmap.get(country);
			Set<String> setofstates = cMap.keySet();
			Iterator<String> itr2 = setofstates.iterator();
			while (itr2.hasNext()) {
				String state = itr2.next();
				System.out.println("++++++++++++++++++");
				System.out.println("      " + state);// gujrat,maharashtra

				Map<String, Integer> smap = cMap.get(state);
				Set<String> setofcities = smap.keySet();
				Iterator<String> itr21 = setofcities.iterator();
				while (itr21.hasNext()) {
					String city = itr21.next();
					System.out.println(city +" " + smap.get(city) );// city//p
				}
			}

		}
		System.out.println(" ===== for each=========== ");

		for (String country : setOfCountries) {

			System.out.println("    " + country);
			System.out.println("++++++++++++++++++++");

			Map<String, Map<String, Integer>> cmap = wmap.get(country);
			Set<String> setofstates = cmap.keySet();

			for (String state : setofstates) {
				System.out.println("++++++++++++++++++++");
				System.out.println("     " + state);

				Map<String, Integer> smap = cmap.get(state);
				Set<String> setofcities = smap.keySet();
				for (String city : setofcities) {
					System.out.println(city + "   " + smap.get(city));

				}
			}

		}
	}
}
