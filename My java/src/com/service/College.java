package com.service;

import com.controller.University;
import com.model1.Student;

public class College {

	public Student addStudentDetails() {
		Student s = new Student();
		s.sid = 301;
		s.name = "Ram";
		s.address = "pune";

		Student s2 = new Student();
		s2.sid = 301;
		s2.name = "Ram";
		s2.address = "pune";

		Student s3 = new Student();

		s3.sid = 401;
		s3.name = "shayam";
		s3.address = "nagpur";

		return s;
	}

	public University addAllUniversityDetails() {
		University u = new University();
		u.s.sid = 101;
		u.s.name = "Akashy";
		u.s.address = "pune";

		u.s2.sid = 102;
		u.s2.name = "nilesh";
		u.s2.address = "pune";

		u.s3.sid = 103;
		u.s3.name = "Ajay";
		u.s3.address = "pcmc";
		return u;

	}

}