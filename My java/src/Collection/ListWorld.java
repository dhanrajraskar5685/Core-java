package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListWorld {

	public List<List<List<String>>> addcountry() {

		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pimpri");
		maharashtra.add("Nagpur");
		maharashtra.add("sagali");

		List<String> gujrat = new ArrayList<String>();
		gujrat.add("kacha");
		gujrat.add("vapi ");
		gujrat.add("Surat ");

		List<List<String>> india = new ArrayList<List<String>>();
		india.add(maharashtra);
		india.add(gujrat);

		List<String> Washington = new ArrayList<String>();
		Washington.add("Seattle");
		Washington.add("Spokane");
		Washington.add("Tacoma");
		List<String> Texas = new ArrayList<String>();
		Texas.add("Abbott");
		Texas.add("Abernathy ");
		Texas.add("Abilene");
		List<List<String>> usa = new ArrayList<List<String>>();
		usa.add(Washington);
		usa.add(Texas);
		List<List<List<String>>> world = new ArrayList<List<List<String>>>();
		world.add(india);
		world.add(usa);
		return world;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListWorld world = new ListWorld();
		System.out.println("*****world country**********");
		List<List<List<String>>> world1 = world.addcountry();

		// System.out.println(world1);
		System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
		System.out.println("*******itertor**********");

		Iterator<List<List<String>>> itr1 = world1.iterator();

		while (itr1.hasNext()) {
			List<List<String>> country = itr1.next();
			System.out.println(country);
			System.out.println("****************");
			Iterator<List<String>> itr2 = country.iterator();
			while (itr2.hasNext()) {

				List<String> state = itr2.next();
				System.out.println(state);

				System.out.println("*****************");
				Iterator<String> itr3 = state.iterator();

				while (itr3.hasNext()) {

					String city = itr3.next();
					System.out.println(city);
				}
			}
		}

		System.out.println("******for each**************");
		for (List<List<String>> country : world1) {
			// System.out.println(country);

			for (List<String> state : country) {

				// System.out.println(state);

				for (String city : state) {

					System.out.println(city);

				}
			}
		}
	}
}
