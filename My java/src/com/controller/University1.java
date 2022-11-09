package com.controller;

public class University1 {
	
	public Student1 s1= new Student1 ();
	public Student1 s2= new Student1 ();
    public Student1 s3= new Student1();

	
public University1 addUniversity1info() {
	University1 u1 =  new University1 ();

	 u1.s1.sid= 301;
	 u1.s1.name= "Akashy";
	 u1.s1.address="kolapur";
	 
	 u1.s2.sid= 402;
	 u1.s2.name="Amol";
	 u1.s2.address="pune";
	 
	 u1.s3.sid= 503;
	 u1.s3.name="nikhil";
	 u1.s3.address="pcmc";
	 
	return u1;
}
}