package Collection;

import java.util.HashSet;
import java.util.Set;

public class Setcollege {

	public Set<Student> addStudentDetails() {

		Student s1 = new Student();

		s1.sid = 301;
		s1.name = "Akashy";
		s1.address = "kolapur";

		Student s2 = new Student();
		s2.sid = 402;
		s2.name = "Amol";
		s2.address = "pune";

		Student s3 = new Student();
		s3.sid = 503;
		s3.name = "nikhil";
		s3.address = "pcmc";

		Set<Student> settofstudent = new HashSet<Student>();
		settofstudent.add(s1);
		settofstudent.add(s2);
		settofstudent.add(s3);

		return settofstudent;
	}

}
