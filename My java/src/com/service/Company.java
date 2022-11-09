package com.service;
import com.controller.Management;
import com.model1.Employee;


public class Company {
	public Employee addEmployeetDetails() {
		Employee e = new Employee();

		 e.eid = 201;
		 e.name = "Rohit";
		 e.address="mumbai";
		 
		 Employee e2 = new Employee();
		 e2.eid=301;
		 e2.name ="Ram";
		 e2.address="pune";
		 
		 Employee e3 = new Employee();
		 
		 e3.eid =401;
		 e3.name="sham";
		 e3.address ="nagpur";
return e2;
}
	public Management addAllEmployeeDetails() {
		 Management m = new Management();
		 m.e.eid= 501;
		 m.e.name= "Akash";
		 m.e.address="pune";
		 
		 m.e2.eid= 502;
		 m.e2.name="nikita";
		 m.e2.address="pune";
		 
		 m.e3.eid= 203;
		 m.e3.name="sanjay";
		 m.e3.address="pcmc";
		return m;
		
		
	}
}