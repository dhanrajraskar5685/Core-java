package Collection;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List list= new ArrayList();// this arraylist class stored a growble array data stored 
		list.add(101);// capacity 10
		list.add(102);
		list.add(101);
		list.add(104);
		list.add(105);
		list.add(102);
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		System.out.println(list.get(3));
		System.out.println(list.contains(102));
		
	}

}
