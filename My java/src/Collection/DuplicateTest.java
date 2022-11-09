package Collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(101, "nilesh");
		Employee e1 = new Employee(101, "nilesh");

		Set<Employee> set = new HashSet<Employee>();
		set.add(e);
		set.add(e1);

		System.out.println(set.size());
		
		
	
	}

}
