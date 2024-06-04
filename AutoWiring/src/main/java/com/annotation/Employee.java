package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	
private Address address;

public Address getAddress() {
	
	return address;
}


//
@Autowired
@Qualifier("add2")
public void setAddress(Address address) {
	System.out.println("Setting address inside setter");
	this.address = address;
}

//public Employee(Address address) {
//	super();
//	this.address = address;
//	System.out.println("Setting address inside constructor");
//}
public String toString() {
	return "Employee [address=" + address + "]";
}

}
