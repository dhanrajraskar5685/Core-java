package Collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, "abc");
		map.put(102, "cdc");
		map.put(103, "io");
		map.put(103, "alop");
		map.put(104, "pae");
		map.put(105, "xyz");
		// map.put(null, "bj");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.get(103));

		System.out.println("  -------itertor---------");

		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();

			System.out.println(i + "  " + map.get(i));
		}
		System.out.println(" ===  for each===== ");
		for (Integer k : keys) {
			System.out.println(k + "  " + map.get(k));
		}

		System.out.println(" =======Linkhashmap==========");
		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(101, "a");
		map2.put(102, "b");
		map2.put(103, "c");
		Set<Integer> keys1 = map2.keySet();
		Iterator<Integer> itr2 = keys1.iterator();
		while (itr2.hasNext()) {
			Integer p = itr2.next();
			System.out.println(p + " " + map2.get(p));
		}
		System.out.println(" ===========  for each ====================");
		for (Integer n : keys1) {
			System.out.println(n + " " + map2.get(n));
		}

		System.out.println("+++++++++++Tree map ++++++++++++++++");

		Map<Integer, String> map23 = new TreeMap<Integer, String>();
		map23.put(107, "a");
		map23.put(109, "b");
		map23.put(103, "c");
		Set<Integer> keys2 = map23.keySet();
		Iterator<Integer> itr3 = keys2.iterator();
		while (itr3.hasNext()) {
			Integer l = itr3.next();
			System.out.println(l + " " + map23.get(l));
		}
		System.out.println(" ===========  for each ====================");
		for (Integer n : keys2) {
			System.out.println(n + " " + map.get(n));
		}

	}

}
