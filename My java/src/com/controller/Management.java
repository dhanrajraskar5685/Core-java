package com.controller;
import com.model1.Employee;
import com.service.Company;
public class Management {
 public  Employee e= new  Employee ();
 public  Employee e2= new  Employee ();
 public  Employee e3= new  Employee ();
 
	public static void main(String[] args) 
	{
		
Company company= new Company();
Employee e = company.addEmployeetDetails();
    
    System.out.println( e.eid+ " " +e.name+ " " +e.address );
     
    System.out.println("..all method..");
    Management m = company.addAllEmployeeDetails();
    System.out.println(m.e.eid+ " " +m.e.name+ " " +m.e.address);
    System.out.println (m.e2.eid+ " " +m.e2.name+ " " +m.e2.address);;
    System.out.println (m.e3.eid+ " " +m.e3.name+ " " +m.e3.address);;
	}

}
