package com.controller;

import com.model1.Student;
import com.service.College;

public class University {
	public Student s = new Student();
	public Student s2 = new Student();
	public Student s3 = new Student();

	public static void main(String[] args) {

		College college = new College();
		Student s = college.addStudentDetails();

		System.out.println(s.sid + " " + s.name + " " + s.address);

		System.out.println("..all method..");

		University u = college.addAllUniversityDetails();
		System.out.println(u.s.sid + " " + u.s.name + " " + u.s.address);
		System.out.println(u.s2.sid + " " + u.s2.name + " " + u.s2.address);
		;
		System.out.println(u.s3.sid + " " + u.s3.name + " " + u.s3.address);
		;

	}
}
