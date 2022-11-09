package com.java.classmagtsystem.controller;

import java.util.Scanner;

import com.java.classmagtsystem.ServiceImpl.ClassMangtSystemImpl;

public class MainClass {
	public static void main(String[] args) {

		boolean flag = true;
		ClassMangtSystemImpl classMangtSystemImpl = new ClassMangtSystemImpl();

		while (flag) {
			Scanner sc = new Scanner(System.in);

			System.out.println("*******************************************");
			System.out.println("*********Welcome To Menu ***************");
			System.out.println("1.Add Course");
			System.out.println("2.Display Course");
			System.out.println("3.AddFaculty");
			System.out.println("4.DisplayFaculty");
			System.out.println("5.AddBatch");
			System.out.println("6.DisplayBatch");
			System.out.println("7.AddStudent");
			System.out.println("8.DisplayStudent");
			System.out.println("9.Exit");
			System.out.println("-------------------------------------------");
			int ch = 0;
			System.out.println("Select Above Choice:");
			try {
				ch = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" plz,Enter Number Only ");
			}

			switch (ch) {

			case 1:
				classMangtSystemImpl.addCourse();
				break;
			case 2:
				classMangtSystemImpl.displayCourse();
				break;
			case 3:
				classMangtSystemImpl.addFaculty();
				break;
			case 4:
				classMangtSystemImpl.displayFaculty();
				break;
			case 5:
				classMangtSystemImpl.addBatch();
				break;
			case 6:
				classMangtSystemImpl.displayBatch();
				break;
			case 7:
				classMangtSystemImpl.addStudent();
				break;
			case 8:
				classMangtSystemImpl.displayStudent();
			case 9:
				flag = false;
				break;
			default:
				System.out.println("You are Enter invalid choice");
				break;
			}

		}
	}
}
