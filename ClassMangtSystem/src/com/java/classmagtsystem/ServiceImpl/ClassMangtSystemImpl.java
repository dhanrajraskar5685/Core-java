package com.java.classmagtsystem.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.classmagtsystem.Service.ClassMagtSystem;
import com.java.classmagtsystem.model.Batch;
import com.java.classmagtsystem.model.Course;
import com.java.classmagtsystem.model.Faculty;
import com.java.classmagtsystem.model.Student;

public class ClassMangtSystemImpl implements ClassMagtSystem {
	Scanner sc = new Scanner(System.in);
	List<Batch> blist = new ArrayList<Batch>();
	List<Course> clist = new ArrayList<Course>();
	List<Faculty> flist = new ArrayList<Faculty>();
	List<Student> slist = new ArrayList<Student>();

	@Override
	public void addCourse() {
		System.out.println("How many course you want to added:");

		int n = getaddcourse();
		for (int i = 0; i < n; i++) {
			Course c = new Course();
			System.out.println("Enter course id:");
			c.setCid(getaddcourse());

			c.setCname(getaddcourse1());

			clist.add(c);
		}

		System.out.println("All course added Succesfully....");
	}

	private int getaddcourse() {
		Scanner sc = new Scanner(System.in);

		int n;
		try {

			n = sc.nextInt();

		} catch (Exception e) {

			System.out.println("Plz,Enter course id in digit :");
			return getaddcourse();
		}

		return n;
	}

	private String getaddcourse1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course name:");
		String s = sc.next();

		return s;

	}

	@Override
	public void displayCourse() {
		for (Course c : clist) {
			System.out.println("Course ID \tCourse Name");
			System.out.println(c.getCid() + "\t         " + c.getCname());
		}

	}

	@Override
	public void addFaculty() {

		System.out.println("How many faculty you want to added:");

		if (clist.isEmpty()) {
			System.out.println("Please,add Course first");

		} else {
			int n = getaddfaculty();
			for (int i = 0; i < n; i++) {

				Faculty f = new Faculty();
				System.out.println("Enter Faculty id:");
				f.setFid(getaddfaculty());

				f.setFname(getaddfaculty1());
				Course c = selectValidCourse();

				f.setCourse(c);
				flist.add(f);

			}

		}
		System.out.println("All faculty added Succesfully....");
	}

	private int getaddfaculty() {
		Scanner sc = new Scanner(System.in);

		int n;
		try {

			n = sc.nextInt();

		} catch (Exception e) {

			System.out.println("Plz,Enter faculty id in digit :");
			return getaddfaculty();
		}
		if (n < 0) {
			return getaddfaculty();

		}
		return n;
	}

	private String getaddfaculty1() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Faculty name:");
		String name = sc.next();
		return name;

	}

	private Course selectValidCourse() {
		Scanner sc = new Scanner(System.in);
		displayCourse();
		System.out.println("select above course id");
		int ch = 0;
		try {
			ch = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("course id should be in digits");
			return selectValidCourse();
		}
		for (Course course : clist) {
			if (course.getCid() == ch) {
				return course;
			}
		}
		System.out.println(" Course id doesn't exits");
		return selectValidCourse();

	}

	@Override
	public void displayFaculty() {
		System.out.println("Faculty id\t Facaulty name\t Course id\t Course name");
		for (Faculty faculty : flist) {

			System.out.println(" " + faculty.getFid() + "\t          " + faculty.getFname() + "\t          "
					+ faculty.getCourse().getCid() + "\t         " + faculty.getCourse().getCname());
		}
	}

	@Override
	public void addBatch() {
		System.out.println("How many Batch you want to added:");

		if (flist.isEmpty()) {
			System.out.println("please,add faculty first");
		} else {

			int n = getaddbatch();
			for (int i = 0; i < n; i++) {

				Batch b = new Batch();
				System.out.println("Enter Batch id:");
				b.setBid(getaddbatch());

				b.setBname(getbatch1());

				Faculty faculty = selectValidfaculty();

				b.setFaculty(faculty);
				blist.add(b);

			}

		}
		System.out.println("All Batch added Succesfully....");
	}

	private int getaddbatch() {
		Scanner sc = new Scanner(System.in);

		int n;
		try {

			n = sc.nextInt();

		} catch (Exception e) {

			System.out.println("Plz,Enter Batch id in digit :");
			return getaddbatch();
		}
		if (n < 0) {
			return getaddbatch();

		}
		return n;
	}

	private String getbatch1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch name:");
		String name = sc.next();
		return name;

	}

	private Faculty selectValidfaculty() {
		Scanner sc = new Scanner(System.in);
		displayFaculty();

		System.out.println("select above faculty id");
		int ch = 0;
		try {
			ch = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Faculty id should be in digits");
			return selectValidfaculty();
		}
		for (Faculty faculty : flist) {
			if (faculty.getFid() == ch) {
				return faculty;
			}
		}
		System.out.println(" Faculty  id doesn't exits");
		return selectValidfaculty();

	}

	@Override
	public void displayBatch() {

		for (Batch b : blist) {
			System.out.println("Batch id\tBatch Name\tFaculty id\tFaculty Name\tCourse id\tCourse Name");
			System.out.println(b.getBid() + "\t         " + b.getBname() + "\t           " + b.getFaculty().getFid()
					+ "\t           " + b.getFaculty().getFname() + "\t           "
					+ b.getFaculty().getCourse().getCid() + "\t             " + b.getFaculty().getCourse().getCname());

		}

	}

	@Override
	public void addStudent() {
		System.out.println("How many Student you want to added:");

		if (blist.isEmpty()) {

			System.out.println("please,add batch first ");
		} else {

			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {

				Student s = new Student();
				System.out.println("Enter Student id:");
				s.setSid(getaddstudent());

				s.setName(getaddstudent1());

				Batch batch = selectValidbatch();

				s.setBatch(batch);
				slist.add(s);

			}

		}
		System.out.println("All Student added Succesfully....");

	}

	private int getaddstudent() {
		Scanner sc = new Scanner(System.in);

		int n;
		try {

			n = sc.nextInt();

		} catch (Exception e) {

			System.out.println("Plz,Enter student  id in digit :");
			return getaddbatch();
		}
		if (n < 0) {
			return getaddbatch();

		}
		return n;
	}

	private String getaddstudent1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name:");
		String name = sc.next();
		return name;

	}

	private Batch selectValidbatch() {
		Scanner sc = new Scanner(System.in);
		displayBatch();

		System.out.println("Select above Batch id :");
		int ch;
		try {
			ch = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Faculty id should be in digits");
			return selectValidbatch();
		}
		for (Batch batch : blist) {
			if (batch.getBid() == ch) {
				return batch;
			}
		}
		System.out.println(" Batch  id doesn't exits");
		return selectValidbatch();

	}

	@Override
	public void displayStudent() {
		for (Student s : slist) {
			System.out.println(
					"Student id\tStudent Name\tBatch id\tBatchName\tFaculty id\tFaculty Name\tCourse id\tCourse Name");
			System.out.println(s.getSid() + "\t        " + s.getName() + "\t           " + s.getBatch().getBid()
					+ "\t            " + s.getBatch().getBname() + "\t       " + s.getBatch().getFaculty().getFid()
					+ "\t        " + s.getBatch().getFaculty().getFname() + "\t              "
					+ s.getBatch().getFaculty().getCourse().getCid() + "\t          " + "\t        "
					+ s.getBatch().getFaculty().getCourse().getCname());

		}

	}

}
