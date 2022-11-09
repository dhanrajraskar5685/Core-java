package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListmainUniversity {

	public List<List<String>> adduniversity() {

		List<String> Puneuniversity = new LinkedList<String>();
		Puneuniversity.add("Pharamacy");
		Puneuniversity.add("Engineering");
		Puneuniversity.add("Agricultur");

		List<String> Shivajiuniversity = new LinkedList<String>();
		Shivajiuniversity.add("B.com");
		Shivajiuniversity.add("B.sc");
		Shivajiuniversity.add("B.A");

		List<String> Mumbaiuniversity = new LinkedList<String>();
		Mumbaiuniversity.add("M.BA");
		Mumbaiuniversity.add("M.sc");
		Mumbaiuniversity.add("M.com");

		List<List<String>> Maharashtra = new LinkedList<List<String>>();
		Maharashtra.add(Puneuniversity);
		Maharashtra.add(Shivajiuniversity);
		Maharashtra.add(Mumbaiuniversity);
		return Maharashtra;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListmainUniversity main = new ListmainUniversity();
		List<List<String>> university = main.adduniversity();

		System.out.println("***iteretor interface***");
		Iterator<List<String>> itr = university.iterator();

		while (itr.hasNext()) {
			List<String> university1 = itr.next();
			// System.out.println(university1 );

			Iterator<String> itr2 = university1.iterator();

			while (itr2.hasNext()) {
				System.out.println(itr2.next());

			}

		}

		System.out.println("***each loop****");
		for (List<String> university1 : university) {
			for (String university2 : university1) {
				System.out.println(university2);
			}
		}

	}
}
