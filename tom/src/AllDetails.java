
public class AllDetails {

	public Student getStudentinfo() {
		Student s = new Student();
		s.sid = 301;
		s.name = "Akashy";
		s.address = "kolapur";

		return s;
	}

	public University getallStudentinfo() {
		University u = new University();

		u.s1.sid = 701;
		u.s1.name = "Aka";
		u.s1.address = "kolapur";

		u.s2.sid = 402;
		u.s2.name = "Amol";
		u.s2.address = "pune";

		u.s3.sid = 503;
		u.s3.name = "nikhil";
		u.s3.address = "pcmc";

		return u;

	}

	public State getalluniversityinfo() {
		State t = new State();
		t.u1.s1.sid = 301;
		t.u1.s1.name = "Ram";
		t.u1.s1.address = "pune";

		t.u1.s2.sid = 501;
		t.u1.s2.name = "Radha";
		t.u1.s2.address = "pune";

		t.u1.s3.sid = 401;
		t.u1.s3.name = "shayam";
		t.u1.s3.address = "nagpur";

		t.u2.s1.sid = 101;
		t.u2.s1.name = "Akashy";
		t.u2.s1.address = "pune";

		t.u2.s2.sid = 102;
		t.u2.s2.name = "nilesh";
		t.u2.s2.address = "pune";

		t.u2.s3.sid = 103;
		t.u2.s3.name = "Ajay";
		t.u2.s3.address = "pcmc";

		t.u3.s1.sid = 501;
		t.u3.s1.name = "Akash";
		t.u3.s1.address = "pune";

		t.u3.s2.sid = 502;
		t.u3.s2.name = "nikita";
		t.u3.s2.address = "pune";

		t.u3.s3.sid = 203;
		t.u3.s3.name = "sanjay";
		t.u3.s3.address = "pcmc";
		return t;

	}
}