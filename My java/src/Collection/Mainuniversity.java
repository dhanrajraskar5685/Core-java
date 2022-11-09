package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Mainuniversity {

	public Set<Set<String>> adduniversity() {

		Set<String> Puneuniversity = new HashSet<String>();
		Puneuniversity.add("Pharamacy");
		Puneuniversity.add("Engineering");
		Puneuniversity.add("Agricultur");

		Set<String> Shivajiuniversity = new HashSet<String>();
		Shivajiuniversity.add("B.com");
		Shivajiuniversity.add("B.sc");
		Shivajiuniversity.add("B.A");

		Set<String> Mumbaiuniversity = new HashSet<String>();
		Mumbaiuniversity.add("M.BA");
		Mumbaiuniversity.add("M.sc");
		Mumbaiuniversity.add("M.com");

		Set<Set<String>> Maharashtra = new HashSet<Set<String>>();
		Maharashtra.add(Puneuniversity);
		Maharashtra.add(Shivajiuniversity);
		Maharashtra.add(Mumbaiuniversity);
		return Maharashtra;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainuniversity main = new Mainuniversity();
		Set<Set<String>> university = main.adduniversity();

		System.out.println("***iteretor interface***");
		Iterator<Set<String>> itr = university.iterator();

		while (itr.hasNext()) {
			Set<String> university1 = itr.next();
			// System.out.println(university1 );

			Iterator<String> itr2 = university1.iterator();

			while (itr2.hasNext()) {
				System.out.println(itr2.next());

			}

		}

		System.out.println("***each loop****");
		for (Set<String> university1 : university) {
			for (String university2 : university1) {
				System.out.println(university2);
			}
		}

	}
}
