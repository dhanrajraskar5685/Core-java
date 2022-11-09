package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetProgramWorld {

	public Set<Set<Set<String>>> addcountry() {

		Set<String> maharashtra =  new LinkedHashSet<String>();
		maharashtra.add("pimpri");
		maharashtra.add("Nagpur");
		maharashtra.add("sagali");

		Set<String> gujrat = new LinkedHashSet<String>();
		gujrat.add("kacha");
		gujrat.add("vapi");
		gujrat.add("Surat");

		Set<Set<String>> india = new LinkedHashSet<Set<String>>(); 
		india.add(maharashtra);
		india.add(gujrat);

		Set<String> Washington = new  LinkedHashSet<String>();
		Washington.add("Seattle");
		Washington.add("Spokane");
		Washington.add("Tacoma");
		
		Set<String>Texas = new LinkedHashSet<String>();
		Texas.add("Abbott");
		Texas.add("Abernathy ");
		Texas.add("Abilene");
		
		
		
		Set<Set<String>>usa = new LinkedHashSet<Set<String>>();
		usa.add(Washington);
		usa.add(Texas);
		
		
		Set<Set<Set<String>>>world = new LinkedHashSet<Set<Set<String>>>();
	world.add(usa);
	world.add(india);
		return world;
	}
public static void main(String[] args) {
	
	SetProgramWorld world = new SetProgramWorld();
	
	System.out.println("*****world country**********");
	
	Set<Set<Set<String>>> world1 = world.addcountry();

	// System.out.println(world1);
	System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
	System.out.println("*******itertor**********");

	Iterator<Set<Set<String>>>itr1 = world1.iterator();

	while (itr1.hasNext()) {
		Set<Set<String>> country = itr1.next();
		System.out.println(country);
		System.out.println("****************");
		Iterator<Set<String>> itr2 = country.iterator();
		while (itr2.hasNext()) {

			Set<String> state = itr2.next();
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
	for (Set<Set<String>> country : world1) {

		for (Set<String> state : country) {


			for (String city : state) {

				System.out.println(city);

			}
		}
	}
	
	
}
}