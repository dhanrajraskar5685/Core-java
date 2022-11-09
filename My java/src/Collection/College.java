package Collection;

import java.util.ArrayList;
import java.util.List;

public class College {
	
	public List< Student>addStudentDetails() {
		
		Student s1 = new Student();
		
		 s1.sid= 301;
		 s1.name= "Akashy";
		 s1.address="kolapur";
		 
		 Student s2 = new Student();
		 s2.sid= 402;
		 s2.name="Amol";
		 s2.address="pune";
		 
		 Student s3 = new Student();
		 s3.sid= 503;
		 s3.name="nikhil";
		 s3.address="pcmc";
		
		 List<Student>listofstudent= new ArrayList<Student>();

		 listofstudent.add(s1);
		 listofstudent.add(s2);
		 listofstudent.add(s3);
		return listofstudent;
	}
	

}
