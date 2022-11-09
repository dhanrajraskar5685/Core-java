package Collection;

import java.util.Iterator;
import java.util.Set;

public class Setuniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setcollege college = new Setcollege();
		Set<Student> setstudent = college.addStudentDetails();

		Iterator<Student> itr = setstudent.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.sid + "  " + s.name + " " + s.address);
		}

		System.out.println("****for each********");

		for (Student s : setstudent) {

			System.out.println(s.sid + "" + s.name + "" + s.address);

		}

	}

}
