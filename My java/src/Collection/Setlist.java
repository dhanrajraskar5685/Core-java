package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setlist {
	// set contain only unique element,duplicate not allowed;
	// set contain only one null elements;
	// random access of element not allow
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**hashset**");
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20); // duplicate not allow.
		set.add(30); // Insertion order not maintain.
		// set.add(null); //only one null value.
		set.add(30);
		System.out.println(set);

		System.out.println("**iterator HashSet**");
		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {

			int i = itr.next();
			System.out.println(i);

		}
		System.out.println("**for each HashSet**");

		for (Integer i : set) {
			System.out.println(i);

		}

		System.out.println("**linkedhashset**");

		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(10);
		set2.add(20); // duplicate not allow.
		set2.add(40); // insertion order maintain.
		set2.add(null); // only one null value.
		set2.add(60);
		set2.add(60);
		set2.add(null);
		System.out.println(set2);
		System.out.println(" **itertor linkedhashset**");
		Iterator<Integer> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}
		System.out.println("****for eachlinkedhashset *****");
		for (Integer i : set2) {
			System.out.println(i);
		}

		System.out.println("***Treeset***");
		Set<Integer> set3 = new TreeSet<Integer>();

		set3.add(10);
		set3.add(90); // duplicate not allow.
		set3.add(40); // insertion order maintain but asending order.
		// set3.add(null); // no null value.
		set3.add(60);
		set3.add(60);
		// set3.add(null);

		System.out.println("***  itertor Treeset *****");

		Iterator<Integer> itr3 = set3.iterator();

		while (itr3.hasNext()) {

			System.out.println(itr3.next());
		}
		System.out.println("*********for each treeset*************");
		for (Integer i : set3) {
			System.out.println(i);
		}

		Set<Employee> setofemployee = new HashSet<Employee>();
		setofemployee.add(new Employee(101, "nilesh"));
		setofemployee.add(new Employee(102, "DHANRAJ"));

		Iterator<Employee> itr4 = setofemployee.iterator();

		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		for (Employee e : setofemployee) {
			System.out.println(e);
		}

	}

}
