package Collection.map.enteryset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();
		{

			map.put(101, " asd");
			map.put(102, " esd");
			map.put(103, " rsd");
			map.put(104, " tsd");
			map.put(105, " psd");
			System.out.println(map);
			System.out.println(map.size());
			System.out.println(map.isEmpty());
			System.out.println(map.get(102));
			
		Set<Map.Entry < Integer,String >>set=map.entrySet();
		Iterator<Map.Entry<Integer, String>>itr=set.iterator();
		while(itr.hasNext() ) {
			Map.Entry<Integer, String> enteries=itr.next();
			
			System.out.println(enteries.getKey()+""+enteries.getValue());
			
			
			
		}
		
		
		}
		}
	}

