package Collection;

import java.util.Iterator;
import java.util.List;

public class University {

	public static void main(String[] args) {
		College college = new College();

		List<Student> liststudent = college.addStudentDetails();
		Iterator<Student> itr = liststudent.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.sid + " " + s.name + " " + s.address);

		}

		System.out.println("****for each loop******");
		for (Student s1 : liststudent) {
			System.out.println(s1.sid + " " + s1.name + " " + s1.address);
		}
	}

}
