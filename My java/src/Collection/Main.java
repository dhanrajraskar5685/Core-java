package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>(); // array list used when select and store
		al.add(1);// if you want to manipulation data ,we go to linklist
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.remove(2);
		al.add(2, 12);
		System.out.println(al.size());

		
		
		System.out.println("**********************");
		List<Integer>al2 = new LinkedList<Integer>(); // have node
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		al2.add(2, 5);
		System.out.println(al2.size());
		System.out.println(al2);
		
		
	}

}
