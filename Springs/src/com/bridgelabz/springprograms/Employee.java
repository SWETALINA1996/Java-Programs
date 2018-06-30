package com.bridgelabz.springprograms;

public class Employee 
{
	String name;
	
	Address address;
	Address1 address1;
	Address2 address2;
	
public Address1 getAddress1() {
		return address1;
	}

	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}

	public Address2 getAddress2() {
		return address2;
	}

	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Employee() 
{
	System.out.println("Employee found");
}

public Employee(Address address)
{
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + ", address1=" + address1 + ", address2=" + address2
			+ "]";
}

}
