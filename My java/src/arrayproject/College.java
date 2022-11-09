package arrayproject;

public class College {

	public Student[] addstudentdetails() {

		Student s = new Student();
		s.sid = 301;
		s.name = "Ram";
		s.address = "pune";

		Student s2 = new Student();
		s2.sid = 302;
		s2.name = "Ram";
		s2.address = "pune";

		Student s3 = new Student();

		s3.sid = 401;
		s3.name = "shayam";
		s3.address = "nagpur";
		Student[] studentarray = { s, s2, s3 };

		return studentarray;

	}

}
