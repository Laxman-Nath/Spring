package com.xml;

public class Employee {
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	System.out.println("Inside setters:");
	this.address = address;
}

public Employee(Address address) {
	
	super();
	this.address = address;
	System.out.println("Inside contructor");
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}


}
