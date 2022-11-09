package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(10);
		al.add(15);
		al.add(60);
		al.add(80);
		al.add(70);
		System.out.println(al.size());
		System.out.println(al.get(2));
		
		System.out.println("************Using iterator************");
	Iterator<Integer>itr=al.iterator();
	
		while( itr.hasNext()) {
			
		int i	=itr.next();
		System.out.println(i);
		}
		System.out.println("****for each****");
		for (Integer j :al) {
			System.out.println(j);
		}
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("RAj");
		al1.add("Dhanraj");
	Iterator<String> itr1	=al1.iterator();
		System.out.println("*************************");
		while(itr1.hasNext() ) {
			String  i = itr1.next();
			System.out.println(i);
		}
			System.out.println("******************");
			for(String t :al1) {
				System.out.println(t);
			
		}
		}
	}


