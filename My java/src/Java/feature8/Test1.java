package Java.feature8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream = Stream.of(1, 451, 2, 3, 4, 5, 6, 77, 88);
		stream.forEach(n -> System.out.println(n));
		Stream<String> stream1 = Stream.of("A", "B", "c", "d", "l");
		stream1.forEach(n -> System.out.println(n));

		List<Integer> l1 = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			l1.add(i);

		}
		System.out.println("+++++list++++++++++");
		Stream<Integer> si = l1.stream();
		si.forEach(n -> System.out.println(n));

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "b");
		map.put(3, "h");
		map.put(4, "l");
		map.put(5, "o");
		Stream<Entry<Integer, String>> m = map.entrySet().stream();
		m.forEach(n -> System.out.println(n));
		List<Integer> l2 = l1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		l2.forEach(n -> System.out.println(n));
		System.out.println("+++++++++++++square+++++++++++++++");
		List<Integer> l3 = l1.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
		l3.forEach(n -> System.out.println(n));
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(1);
		l4.add(11);
		l4.add(1);
		l4.add(11);
		l4.add(10);
		l4.add(17);
		System.out.println("+++++ Duplicate remove+++++++++++++");
		List<Integer> l5 = l4.stream().distinct().collect(Collectors.toList());
		System.out.println(l5);

		System.out.println("+++++Asending order+++++++++++++");
		List<Integer> l6 = l4.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(l6);

		System.out.println("+++++reverse order+++++++++++++");
		List<Integer> l7 = l4.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(l7);
		System.out.println("++++++++++++++max +++++++++++++++++++");
		OptionalInt p = l4.stream().mapToInt(Integer::intValue).max();
		System.out.println(p);
		System.out.println("++++++++++++++min +++++++++++++++++++");
		OptionalInt op = l4.stream().mapToInt(Integer::intValue).min();
		System.out.println(op);
	}
}
