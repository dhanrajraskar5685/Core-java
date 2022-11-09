package com.controller;

public class GetAllUniversity {

	public static void main(String[] args) {
		
		State a= new State ();
	State gt = a.addallinfo();
	
	University1 u = new University1();
	 University1 u1 = u.addUniversity1info();
	
	System.out.println(u1.s1.sid+" "+u1.s1.name+" "+u1.s1.address);
	System.out.println(u1.s2.sid+ " " +u1.s2.name+ " "+u1.s1.address);
	System.out.println(u1.s3.sid+ " " +u1.s3.name+ " "+u1.s3.address );
	
	
	
	System.out.println("****************************************" );
	
	System.out.println(gt.u1.s1.sid+ " " + gt.u1.s1.name + " "+ gt.u1.s1.address );
	System.out.println(gt.u1.s2.sid+ " " + gt.u1.s2.name + " "+ gt.u1.s2.address );
	System.out.println(gt.u1.s3.sid+ " " + gt.u1.s3.name + " "+ gt.u1.s3.address );
	System.out.println(gt.u2.s1.sid+ " " + gt.u1.s1.name + " "+ gt.u1.s1.address );
	System.out.println(gt.u2.s2.sid+ " " + gt.u1.s2.name + " "+ gt.u1.s2.address );
	System.out.println(gt.u2.s3.sid+ " " + gt.u1.s3.name + " "+ gt.u1.s3.address );
	}
	
 
 
	}


