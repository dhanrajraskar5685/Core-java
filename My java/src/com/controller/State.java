package com.controller;


public class State {
	
	University1 u1= new University1();
	University1 u2= new University1();

 
		
		public State addallinfo() {
			State a= new State ();
			 a.u1.s1.sid= 1001;
			 a.u1.s1.name= "xyz";
			 a.u1.s1.address="solapur";
			 
			 a.u1.s2.sid= 1002;
			 a.u1.s2.name="tqr ";
			 a.u1.s2.address="pimpri";
			 
			 a.u1.s3.sid= 1003;
			 a.u1.s3.name="mno";
			 a.u1.s3.address="jyotpur";
			 
			 a.u2.s1.sid= 2001;
			 a.u2.s1.name= "Abc";
			 a.u2.s1.address="solapur";
			 
			 a.u2.s2.sid= 2002;
			 a.u2.s2.name="egf ";
			 a.u2.s2.address="pimpri";
			 
			 a.u2.s3.sid= 2003;
			 a.u2.s3.name="pqr";
			 a.u2.s3.address="jyotpur";
			
		return a;
	}
}
		
	
				
		
	
	


